package kotlinx.coroutines.android;

import android.os.Looper;
import bc.g;
import java.util.List;
import yb.u;
import zb.a;
import zb.c;

/* loaded from: classes2.dex */
public final class AndroidDispatcherFactory implements g {
    @Override // bc.g
    public u createDispatcher(List<? extends g> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new a(c.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // bc.g
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // bc.g
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
