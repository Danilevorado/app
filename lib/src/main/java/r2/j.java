package r2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
abstract class j {
    static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
