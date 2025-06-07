package m3;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f25351a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f25352b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return (Bitmap) this.f25351a.get(num);
    }
}
