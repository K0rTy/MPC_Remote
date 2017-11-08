package ged.mediaplayerremote.presentation.model;

import ged.mediaplayerremote.domain.model.PlaybackState;

/**
 * Class that represents status of the MPC-HC server. Contains all variables describing status of currently played file.
 * Used in presentation layer.
 */
public class PlaybackStatusModel {
    private String fileName;
    private PlaybackState playbackState;
    private int volume;
    private long position;
    private String positionString;
    private long duration;
    private String durationString;
    private boolean muted;
    private long timeStamp;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public PlaybackState getPlaybackState() {
        return playbackState;
    }

    public void setPlaybackState(PlaybackState playbackState) {
        this.playbackState = playbackState;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public String getPositionString() {
        return positionString;
    }

    public void setPositionString(String positionString) {
        this.positionString = positionString;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getDurationString() {
        return durationString;
    }

    public void setDurationString(String durationString) {
        this.durationString = durationString;
    }

    public boolean isMuted() {
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
