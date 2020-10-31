package core.pokemon.network.message.base;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import core.pokemon.network.message.registry.MessageRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

@SuppressWarnings("all")
public abstract class AbstractMessage<E> {

    private int id;
    private TYPE type;

    public AbstractMessage(Class<?> source, TYPE sourceType) {
        this.id = MessageRegistry.getIdBySource(source);
        this.type = sourceType;
    }

    public int getId() {
        return this.id;
    }

    public abstract ByteBuf encode(@Nullable ByteBuf byteBuf);

    public abstract E decode(@NotNull ByteBuf byteBuf);

    public abstract void handle(E msg, ChannelHandlerContext ctx);

    public static enum TYPE {
        UNKNOWN("unknown", 0),
        STATUS("status", 1),
        BATTLE("battle", 2),
        SYNC("sync", 3);

        private String identifier;
        private int position;

        private TYPE(String identifier, int position) {
            this.identifier = identifier;
            this.position = position;
        }

        public int getId() {
            return this.position;
        }

        public String toString() {
            return this.identifier;
        }
    }
}
