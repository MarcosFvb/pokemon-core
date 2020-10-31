package core.pokemon.network.message;

import core.pokemon.network.message.base.AbstractMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

@SuppressWarnings("all")
public abstract class BattleMessage {

    public static AbstractMessage.TYPE TYPE = StatusMessage.TYPE.BATTLE;

    public static class Invite extends AbstractMessage<BattleMessage.Invite> {

        public Invite() {
            super(Invite.class, BattleMessage.TYPE);
        }

        @Override
        public ByteBuf encode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public Invite decode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public void handle(Invite msg, ChannelHandlerContext ctx) {

        }
    }

    public static class Response extends AbstractMessage<BattleMessage.Response> {

        public Response() {
            super(Response.class, BattleMessage.TYPE);
        }

        @Override
        public ByteBuf encode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public Response decode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public void handle(Response msg, ChannelHandlerContext ctx) {

        }
    }

    public static class Message extends AbstractMessage<Message> {

        public Message() {
            super(Message.class, BattleMessage.TYPE);
        }

        @Override
        public ByteBuf encode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public Message decode(ByteBuf byteBuf) {
            return null;
        }

        @Override
        public void handle(Message msg, ChannelHandlerContext ctx) {

        }
    }
}
