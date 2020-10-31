package core.pokemon.network.message;

import core.pokemon.network.message.base.AbstractMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

@SuppressWarnings("all")
public abstract class StatusMessage {

    public static AbstractMessage.TYPE TYPE = AbstractMessage.TYPE.STATUS;

    public static class Connect extends AbstractMessage<Connect> {

        public Connect() {
            super(Connect.class, StatusMessage.TYPE);
        }

        @Override
        public ByteBuf encode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public Connect decode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public void handle(Connect msg, ChannelHandlerContext ctx) {

        }
    }

    public static class Update extends AbstractMessage<Update> {

        public Update() {
            super(Update.class, StatusMessage.TYPE);
        }

        @Override
        public ByteBuf encode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public Update decode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public void handle(Update msg, ChannelHandlerContext ctx) {

        }
    }

    public static class Disconnect extends AbstractMessage<Disconnect> {

        public Disconnect() {
            super(Disconnect.class, StatusMessage.TYPE);
        }

        @Override
        public ByteBuf encode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public Disconnect decode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public void handle(Disconnect msg, ChannelHandlerContext ctx) {

        }
    }
}
