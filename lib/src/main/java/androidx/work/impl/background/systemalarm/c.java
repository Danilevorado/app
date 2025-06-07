package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import b1.j;
import g1.v;
import g1.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f4083e = j.i("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f4084a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4085b;

    /* renamed from: c, reason: collision with root package name */
    private final g f4086c;

    /* renamed from: d, reason: collision with root package name */
    private final d1.e f4087d;

    c(Context context, int i10, g gVar) {
        this.f4084a = context;
        this.f4085b = i10;
        this.f4086c = gVar;
        this.f4087d = new d1.e(gVar.g().r(), (d1.c) null);
    }

    void a() {
        List<v> listS = this.f4086c.g().s().J().s();
        ConstraintProxy.a(this.f4084a, listS);
        this.f4087d.a(listS);
        ArrayList<v> arrayList = new ArrayList(listS.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (v vVar : listS) {
            String str = vVar.f23739a;
            if (jCurrentTimeMillis >= vVar.c() && (!vVar.h() || this.f4087d.e(str))) {
                arrayList.add(vVar);
            }
        }
        for (v vVar2 : arrayList) {
            String str2 = vVar2.f23739a;
            Intent intentB = b.b(this.f4084a, y.a(vVar2));
            j.e().a(f4083e, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f4086c.f().a().execute(new g.b(this.f4086c, intentB, this.f4085b));
        }
        this.f4087d.d();
    }
}
