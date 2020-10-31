package core.pokemon.network.message.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import core.pokemon.network.message.base.AbstractMessage;

import java.util.Optional;

@SuppressWarnings("all")
public abstract class MessageRegistry {

    private static final BiMap<Integer, Class<?>> message_map;

    public static boolean registerMessage(int id, Class<?> source) {
        if (!message_map.containsKey(id) && !message_map.containsValue(source)) {
            message_map.put(id, source);
            return true;
        }
        return false;
    }

    public static int getIdBySource(Class<?> source) {
        return Optional.of(message_map.inverse().get(source))
                .filter(value -> value instanceof Integer)
                .map(value -> value)
                .orElse(0);
    }

    public static <L extends AbstractMessage<L>> L getSourceById(int id) {
        return null;
        //        return Optional.of(message_map.get(id))
//            .filter(value -> value != null)
//            .
//            .orElseThrow(() ->
//                new IllegalStateException("Doesn't exit any source registered with id " + id + "."));
    }

    static {
        message_map = HashBiMap.create();
    }
}
