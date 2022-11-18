package BerlinClock.BugHunt;

public class last {
    @Override
    public boolean equals(Object o){
        ...
        CheckpointStatistics that = (CheckpointStatistics) o;
        return id == that.id &&
                savepoint == that.savepoint  &&
                triggerTimestamp == that.triggerTimestamp  &&
                stateSize == that.stateSize  &&
                duration == that.duration  &&
                alignmentBuffered == that.alignmentBuffered  &&
                processedData == that.processedData  &&
                persistedData == that.persistedData  &&
                numSubtasks == that.numSubtasks  &&
                status == that.status  &&
                Object.equals(checkpointType, that.checkpointType)  &&
                Object.equals(
                        checkpointStatisticsPerTask,
                        that.checkpointStatisticsPerTask
                );
    }
}
