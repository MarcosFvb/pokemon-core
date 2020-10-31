package core.pokemon.network.message;

import core.pokemon.network.message.base.AbstractMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

@SuppressWarnings("all")
public abstract class SyncMessage {

    public static AbstractMessage.TYPE TYPE = AbstractMessage.TYPE.SYNC;

    /**
     * This message sync player's information between clients:
     *  - Poke in hand
     *  - Pokedex
     */
    public static class Player extends AbstractMessage<SyncMessage.Player> {

        public Player() {
            super(Player.class, SyncMessage.TYPE);
        }

        @Override
        public ByteBuf encode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public Player decode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public void handle(Player msg, ChannelHandlerContext ctx) {

        }
    }

    /**
     * This message sync player's account data between clients:
     *  - Nickname
     *  - Status
     *  - Level
     */
    public static class Account extends AbstractMessage<SyncMessage.Account> {

        public Account() {
            super(Account.class, SyncMessage.TYPE);
        }

        @Override
        public ByteBuf encode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public Account decode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public void handle(Account msg, ChannelHandlerContext ctx) {

        }
    }
}
