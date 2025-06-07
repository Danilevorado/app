package d3;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;
import k3.s2;
import k3.t2;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    protected final t2 f22835a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        protected final s2 f22836a;

        public a() {
            s2 s2Var = new s2();
            this.f22836a = s2Var;
            s2Var.v("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public a a(String str) {
            this.f22836a.t(str);
            return this;
        }

        public a b(Class cls, Bundle bundle) {
            this.f22836a.u(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f22836a.w("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public f c() {
            return new f(this);
        }

        public final a d(String str) {
            this.f22836a.v(str);
            return this;
        }

        public final a e(Date date) {
            this.f22836a.x(date);
            return this;
        }

        public final a f(int i10) {
            this.f22836a.a(i10);
            return this;
        }

        public final a g(boolean z10) {
            this.f22836a.b(z10);
            return this;
        }

        public final a h(boolean z10) {
            this.f22836a.c(z10);
            return this;
        }
    }

    protected f(a aVar) {
        this.f22835a = new t2(aVar.f22836a, null);
    }

    public final t2 a() {
        return this.f22835a;
    }
}
