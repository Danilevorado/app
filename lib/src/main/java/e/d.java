package e;

import android.content.Context;
import android.content.Intent;
import rb.f;
import rb.h;

/* loaded from: classes.dex */
public final class d extends e.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23003a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @Override // e.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent intent) {
        h.e(context, "context");
        h.e(intent, "input");
        return intent;
    }

    @Override // e.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}
