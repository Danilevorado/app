package e4;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class v implements a.d {

    /* renamed from: c, reason: collision with root package name */
    public static final v f23228c = a().a();

    /* renamed from: b, reason: collision with root package name */
    private final String f23229b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f23230a;

        /* synthetic */ a(y yVar) {
        }

        public v a() {
            return new v(this.f23230a, null);
        }
    }

    /* synthetic */ v(String str, z zVar) {
        this.f23229b = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f23229b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return o.a(this.f23229b, ((v) obj).f23229b);
        }
        return false;
    }

    public final int hashCode() {
        return o.b(this.f23229b);
    }
}
