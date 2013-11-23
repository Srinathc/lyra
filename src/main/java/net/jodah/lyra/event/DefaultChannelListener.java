package net.jodah.lyra.event;

import com.rabbitmq.client.Channel;

/**
 * No-op channel listener for sub-classing.
 * 
 * @author Jonathan Halterman
 */
public abstract class DefaultChannelListener implements ChannelListener {
  @Override
  public void onConsumerRecovery(Channel channel) {
  }

  @Override
  public void onCreate(Channel channel) {
  }

  @Override
  public void onCreateFailure(Throwable failure) {
  }

  @Override
  public void onRecovery(Channel channel) {
  }

  @Override
  public void onRecoveryFailure(Channel channel, Throwable failure) {
  }
}
