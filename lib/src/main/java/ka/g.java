package ka;

import ka.f;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final f f24923a;

    g(f fVar) {
        this.f24923a = fVar;
    }

    public void a(int i10, int i11, String str) {
        n9.b bVar = new n9.b(i10, i11, str);
        f fVar = this.f24923a;
        if (fVar != null) {
            fVar.U(bVar);
        }
    }

    public void b(int i10, String str) {
        f fVar = this.f24923a;
        if (fVar == null) {
            k9.h.k("dbLocalNotificationHelper is null, cant removeLocalNotificationShown");
            return;
        }
        n9.b bVarA = fVar.a(i10, str);
        if (bVarA != null) {
            this.f24923a.W(bVarA.d());
        }
    }

    public void c(f.a aVar) {
        f fVar = this.f24923a;
        if (fVar != null) {
            fVar.y(aVar);
        } else {
            k9.h.l("LocalNotificationStorage", "dbLocalNotificationHelper is null, cant enumerate local notification list");
        }
    }

    public void d(int i10) {
        k9.h.v("LocalNotificationStorage", "Removed dbLocalNotification: " + i10);
        try {
            f fVar = this.f24923a;
            if (fVar == null) {
                k9.h.k("dbLocalNotificationHelper is null, cant remove local push");
            } else {
                fVar.e(i10);
            }
        } catch (Exception e5) {
            k9.h.o(e5);
        }
    }
}
