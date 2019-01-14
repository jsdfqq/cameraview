package extension.record;

import android.support.annotation.NonNull;

import java.io.File;

public class RecordTask {

    private boolean hasAudio;
    private int width;
    private int height;
    private int frameRate;
    private int bitRate;
    private int duration;
    private File output;

    public RecordTask(@NonNull RecordTask task) {
        this.hasAudio = task.hasAudio;
        this.width = task.width;
        this.height = task.height;
        this.frameRate = task.frameRate;
        this.bitRate = task.bitRate;
        this.duration = task.duration;
        this.output = task.output;
    }

    private RecordTask(@NonNull Builder builder) {
        this.hasAudio = builder.hasAudio;
        this.width = builder.width;
        this.height = builder.height;
        this.frameRate = builder.frameRate;
        this.bitRate = builder.bitRate;
        this.duration = builder.duration;
        this.output = builder.output;
    }

    public void setHasAudio(boolean hasAudio) {
        this.hasAudio = hasAudio;
    }

    public void setFrameRate(int frameRate) {
        this.frameRate = frameRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setOutput(File output) {
        this.output = output;
    }

    public boolean isHasAudio() {
        return hasAudio;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getFrameRate() {
        return frameRate;
    }

    public int getBitRate() {
        return bitRate;
    }

    public int getDuration() {
        return duration;
    }

    public File getOutput() {
        return output;
    }

    public static class Builder {

        public RecordTask build() {
            return new RecordTask(this);
        }

        private boolean hasAudio = false;
        private int width = 480;
        private int height = 640;
        private int frameRate = 30;
        private int bitRate = 1024 * 1024;
        private int duration = 60 * 1000;
        private File output;

        public Builder setHasAudio(boolean hasAudio) {
            this.hasAudio = hasAudio;
            return this;
        }

        public Builder setSize(int width, int height) {
            this.width = width;
            this.height = height;
            return this;
        }

        public Builder setFrameRate(int frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setBitRate(int bitRate) {
            this.bitRate = 8 * 1024 * 1024;
            return this;
        }

        public Builder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder setOutput(File output) {
            this.output = output;
            return this;
        }
    }
}
