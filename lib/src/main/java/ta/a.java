package ta;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import n7.l;

/* loaded from: classes2.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    static final List f27393a = Collections.singletonList("com.pushwoosh");

    static String a() {
        String strB = n7.i.d().b();
        return TextUtils.isEmpty(strB) ? "Not yet initialized" : strB;
    }

    static String b() {
        return (l.i() == null || l.i().e() == null || l.i().e().t() == null) ? "Native" : l.i().e().t().a();
    }

    static String c() {
        String strC = n7.i.d().c();
        return TextUtils.isEmpty(strC) ? "Not yet generated" : strC;
    }

    static boolean d() {
        if (ka.e.d() == null || ka.e.d().f() == null) {
            return false;
        }
        return ka.e.d().f().a();
    }

    static boolean e() {
        if (ka.e.d() == null || ka.e.d().g() == null) {
            return false;
        }
        return ka.e.d().g().a();
    }
}
