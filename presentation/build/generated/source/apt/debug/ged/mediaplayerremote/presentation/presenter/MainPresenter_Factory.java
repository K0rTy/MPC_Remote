package ged.mediaplayerremote.presentation.presenter;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.interactor.UseCase;
import ged.mediaplayerremote.domain.interactor.UseCaseParametrized;
import ged.mediaplayerremote.domain.repository.ButtonRepository;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import ged.mediaplayerremote.presentation.model.mapper.PlaybackStatusModelMapper;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainPresenter_Factory implements Factory<MainPresenter> {
  private final Provider<PlaybackStatusModelMapper> playbackStatusModelMapperProvider;
  private final Provider<UserPreferencesRepository> userPreferencesProvider;
  private final Provider<ButtonRepository> buttonRepositoryProvider;
  private final Provider<UseCase> getPlaybackStatusUseCaseProvider;
  private final Provider<UseCase> getSnapshotUseCaseProvider;
  private final Provider<UseCase> editModeListenerUseCaseProvider;
  private final Provider<UseCase> playPauseUseCaseProvider;
  private final Provider<UseCase> fastForwardUseCaseProvider;
  private final Provider<UseCase> rewindUseCaseProvider;
  private final Provider<UseCase> lowerVolumeUseCaseProvider;
  private final Provider<UseCase> raiseVolumeUseCaseProvider;
  private final Provider<UseCaseParametrized<Boolean>> setEditModeUseCaseProvider;
  private final Provider<UseCaseParametrized<Long>> setPositionUseCaseProvider;
  private final Provider<UseCaseParametrized<Integer>> setVolumeUseCaseProvider;

  public MainPresenter_Factory(Provider<PlaybackStatusModelMapper> playbackStatusModelMapperProvider, Provider<UserPreferencesRepository> userPreferencesProvider, Provider<ButtonRepository> buttonRepositoryProvider, Provider<UseCase> getPlaybackStatusUseCaseProvider, Provider<UseCase> getSnapshotUseCaseProvider, Provider<UseCase> editModeListenerUseCaseProvider, Provider<UseCase> playPauseUseCaseProvider, Provider<UseCase> fastForwardUseCaseProvider, Provider<UseCase> rewindUseCaseProvider, Provider<UseCase> lowerVolumeUseCaseProvider, Provider<UseCase> raiseVolumeUseCaseProvider, Provider<UseCaseParametrized<Boolean>> setEditModeUseCaseProvider, Provider<UseCaseParametrized<Long>> setPositionUseCaseProvider, Provider<UseCaseParametrized<Integer>> setVolumeUseCaseProvider) {  
    assert playbackStatusModelMapperProvider != null;
    this.playbackStatusModelMapperProvider = playbackStatusModelMapperProvider;
    assert userPreferencesProvider != null;
    this.userPreferencesProvider = userPreferencesProvider;
    assert buttonRepositoryProvider != null;
    this.buttonRepositoryProvider = buttonRepositoryProvider;
    assert getPlaybackStatusUseCaseProvider != null;
    this.getPlaybackStatusUseCaseProvider = getPlaybackStatusUseCaseProvider;
    assert getSnapshotUseCaseProvider != null;
    this.getSnapshotUseCaseProvider = getSnapshotUseCaseProvider;
    assert editModeListenerUseCaseProvider != null;
    this.editModeListenerUseCaseProvider = editModeListenerUseCaseProvider;
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
    assert setEditModeUseCaseProvider != null;
    this.setEditModeUseCaseProvider = setEditModeUseCaseProvider;
    assert setPositionUseCaseProvider != null;
    this.setPositionUseCaseProvider = setPositionUseCaseProvider;
    assert setVolumeUseCaseProvider != null;
    this.setVolumeUseCaseProvider = setVolumeUseCaseProvider;
  }

  @Override
  public MainPresenter get() {  
    return new MainPresenter(playbackStatusModelMapperProvider.get(), userPreferencesProvider.get(), buttonRepositoryProvider.get(), getPlaybackStatusUseCaseProvider.get(), getSnapshotUseCaseProvider.get(), editModeListenerUseCaseProvider.get(), playPauseUseCaseProvider.get(), fastForwardUseCaseProvider.get(), rewindUseCaseProvider.get(), lowerVolumeUseCaseProvider.get(), raiseVolumeUseCaseProvider.get(), setEditModeUseCaseProvider.get(), setPositionUseCaseProvider.get(), setVolumeUseCaseProvider.get());
  }

  public static Factory<MainPresenter> create(Provider<PlaybackStatusModelMapper> playbackStatusModelMapperProvider, Provider<UserPreferencesRepository> userPreferencesProvider, Provider<ButtonRepository> buttonRepositoryProvider, Provider<UseCase> getPlaybackStatusUseCaseProvider, Provider<UseCase> getSnapshotUseCaseProvider, Provider<UseCase> editModeListenerUseCaseProvider, Provider<UseCase> playPauseUseCaseProvider, Provider<UseCase> fastForwardUseCaseProvider, Provider<UseCase> rewindUseCaseProvider, Provider<UseCase> lowerVolumeUseCaseProvider, Provider<UseCase> raiseVolumeUseCaseProvider, Provider<UseCaseParametrized<Boolean>> setEditModeUseCaseProvider, Provider<UseCaseParametrized<Long>> setPositionUseCaseProvider, Provider<UseCaseParametrized<Integer>> setVolumeUseCaseProvider) {  
    return new MainPresenter_Factory(playbackStatusModelMapperProvider, userPreferencesProvider, buttonRepositoryProvider, getPlaybackStatusUseCaseProvider, getSnapshotUseCaseProvider, editModeListenerUseCaseProvider, playPauseUseCaseProvider, fastForwardUseCaseProvider, rewindUseCaseProvider, lowerVolumeUseCaseProvider, raiseVolumeUseCaseProvider, setEditModeUseCaseProvider, setPositionUseCaseProvider, setVolumeUseCaseProvider);
  }
}

