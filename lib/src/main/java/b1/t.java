package b1;

/* loaded from: classes.dex */
public enum t {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean b() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
