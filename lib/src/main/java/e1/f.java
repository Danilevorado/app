package e1;

import android.os.Build;
import b1.j;
import b1.k;
import g1.v;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f23014f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f23015g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }
    }

    static {
        String strI = j.i("NetworkNotRoamingCtrlr");
        rb.h.d(strI, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f23015g = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f1.h hVar) {
        super(hVar);
        rb.h.e(hVar, "tracker");
    }

    @Override // e1.c
    public boolean b(v vVar) {
        rb.h.e(vVar, "workSpec");
        return vVar.f23748j.d() == k.NOT_ROAMING;
    }

    @Override // e1.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(d1.b bVar) {
        rb.h.e(bVar, "value");
        if (Build.VERSION.SDK_INT < 24) {
            j.e().a(f23015g, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (bVar.a()) {
                return false;
            }
        } else if (bVar.a() && bVar.c()) {
            return false;
        }
        return true;
    }
}
