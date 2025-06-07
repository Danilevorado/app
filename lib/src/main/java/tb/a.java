package tb;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import rb.h;

/* loaded from: classes2.dex */
public final class a extends sb.a {
    @Override // sb.a
    public Random c() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        h.d(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
