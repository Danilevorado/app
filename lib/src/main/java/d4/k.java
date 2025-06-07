package d4;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class k {
    public static void a(Status status, Object obj, b5.j jVar) {
        if (status.y()) {
            jVar.c(obj);
        } else {
            jVar.b(e4.b.a(status));
        }
    }
}
