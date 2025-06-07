package d8;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public interface c {
    a submit(Runnable runnable);

    a submit(Callable callable);
}
