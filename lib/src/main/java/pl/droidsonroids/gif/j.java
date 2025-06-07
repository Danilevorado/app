package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class j extends k {
    j(b bVar) {
        super(bVar);
    }

    @Override // pl.droidsonroids.gif.k
    public void a() {
        b bVar = this.f26015m;
        long jQ = bVar.f25977s.q(bVar.f25976r);
        if (jQ >= 0) {
            this.f26015m.f25973o = SystemClock.uptimeMillis() + jQ;
            if (this.f26015m.isVisible() && this.f26015m.f25972n) {
                b bVar2 = this.f26015m;
                if (!bVar2.f25982x) {
                    bVar2.f25971m.remove(this);
                    b bVar3 = this.f26015m;
                    bVar3.B = bVar3.f25971m.schedule(this, jQ, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f26015m.f25978t.isEmpty() && this.f26015m.b() == this.f26015m.f25977s.i() - 1) {
                b bVar4 = this.f26015m;
                bVar4.f25983y.sendEmptyMessageAtTime(bVar4.c(), this.f26015m.f25973o);
            }
        } else {
            b bVar5 = this.f26015m;
            bVar5.f25973o = Long.MIN_VALUE;
            bVar5.f25972n = false;
        }
        if (!this.f26015m.isVisible() || this.f26015m.f25983y.hasMessages(-1)) {
            return;
        }
        this.f26015m.f25983y.sendEmptyMessageAtTime(-1, 0L);
    }
}
