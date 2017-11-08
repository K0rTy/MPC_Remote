package ged.mediaplayerremote.presentation.presenter;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.interactor.UseCase;
import ged.mediaplayerremote.presentation.model.mapper.PlaybackStatusModelMapper;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class WidgetPresenter_Factory implements Factory<WidgetPresenter> {
  private final Provider<PlaybackStatusModelMapper> playbackStatusModelMapperProvider;
  private final Provider<UseCase> playPauseUseCaseProvider;
  private final Provider<UseCase> fastForwardUseCaseProvider;
  private final Provider<UseCase> rewindUseCaseProvider;
  private final Provider<UseCase> lowerVolumeUseCaseProvider;
  private final Provider<UseCase> raiseVolumeUseCaseProvider;
  private final Provider<UseCase> getPlaybackStatusUpdatesUseCaseProvider;
  private final Provider<UseCase> reconnectUseCaseProvider;

  public WidgetPresenter_Factory(Provider<PlaybackStatusModelMapper> playbackStatusModelMapperProvider, Provider<UseCase> playPauseUseCaseProvider, Provider<UseCase> fastForwardUseCaseProvider, Provider<UseCase> rewindUseCaseProvider, Provider<UseCase> lowerVolumeUseCaseProvider, Provider<UseCase> raiseVolumeUseCaseProvider, Provider<UseCase> getPlaybackStatusUpdatesUseCaseProvider, Provider<UseCase> reconnectUseCaseProvider) {  
    assert playbackStatusModelMapperProvider != null;
    this.playbackStatusModelMapperProvider = playbackStatusModelMapperProvider;
    assert playPauseUseCaseProvider != null;
    this.playPauseUseCaseProvider = playPauseUseCaseProvider;
    assert fastForwardUseCaseProvider != null;
    this.fastForwardUseCaseProvider = fastForwardUseCaseProvider;
    assert rewindUseCaseProvider != null;
    this.rewindUseCaseProvider = rewindUseCaseProvider;
    assert lowerVolumeUseCaseProvider != null;
    this.lowerVolumeUseCaseProvider = lowerVolumeUseCaseProvider;
    assert raiseVolumeUseCaseProvider != null;
    this.raiseVolumeUseCaseProvider = raiseVolumeUseCaseProvider;
    assert getPlaybackStatusUpdatesUseCaseProvider != null;
    this.getPlaybackStatusUpdatesUseCaseProvider = getPlaybackStatusUpdatesUseCaseProvider;
    assert reconnectUseCaseProvider != null;
    this.reconnectUseCaseProvider = reconnectUseCaseProvider;
  }

  @Override
  public WidgetPresenter get() {  
    return new WidgetPresenter(playbackStatusModelMapperProvider.get(), playPauseUseCaseProvider.get(), fastForwardUseCaseProvider.get(), rewindUseCaseProvider.get(), lowerVolumeUseCaseProvider.get(), raiseVolumeUseCaseProvider.get(), getPlaybackStatusUpdatesUseCaseProvider.get(), reconnectUseCaseProvider.get());
  }

  public static Factory<WidgetPresenter> create(Provider<PlaybackStatusModelMapper> playbackStatusModelMapperProvider, Provider<UseCase> playPauseUseCaseProvider, Provider<UseCase> fastForwardUseCaseProvider, Provider<UseCase> rewindUseCaseProvider, Provider<UseCase> lowerVolumeUseCaseProvider, Provider<UseCase> raiseVolumeUseCaseProvider, Provider<UseCase> getPlaybackStatusUpdatesUseCaseProvider, Provider<UseCase> reconnectUseCaseProvider) {  
    return new WidgetPresenter_Factory(playbackStatusModelMapperProvider, playPauseUseCaseProvider, fastForwardUseCaseProvider, rewindUseCaseProvider, lowerVolumeUseCaseProvider, raiseVolumeUseCaseProvider, getPlaybackStatusUpdatesUseCaseProvider, reconnectUseCaseProvider);
  }
}

