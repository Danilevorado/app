package bb;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
class c implements e9.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4598a;

    c(Context context) {
        this.f4598a = context;
    }

    @Override // e9.a
    public SharedPreferences a(String str) {
        Context context = this.f4598a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(str, 0);
    }
}
