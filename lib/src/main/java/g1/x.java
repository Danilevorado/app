package g1;

import android.database.Cursor;
import androidx.room.i0;
import g1.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f23761a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.g f23762b;

    /* renamed from: c, reason: collision with root package name */
    private final q0.f f23763c;

    /* renamed from: d, reason: collision with root package name */
    private final q0.m f23764d;

    /* renamed from: e, reason: collision with root package name */
    private final q0.m f23765e;

    /* renamed from: f, reason: collision with root package name */
    private final q0.m f23766f;

    /* renamed from: g, reason: collision with root package name */
    private final q0.m f23767g;

    /* renamed from: h, reason: collision with root package name */
    private final q0.m f23768h;

    /* renamed from: i, reason: collision with root package name */
    private final q0.m f23769i;

    /* renamed from: j, reason: collision with root package name */
    private final q0.m f23770j;

    /* renamed from: k, reason: collision with root package name */
    private final q0.m f23771k;

    /* renamed from: l, reason: collision with root package name */
    private final q0.m f23772l;

    /* renamed from: m, reason: collision with root package name */
    private final q0.m f23773m;

    /* renamed from: n, reason: collision with root package name */
    private final q0.m f23774n;

    class a extends q0.m {
        a(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class b extends q0.m {
        b(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class c extends q0.m {
        c(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class d extends q0.m {
        d(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class e extends q0.g {
        e(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // q0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u0.k kVar, v vVar) throws Throwable {
            String str = vVar.f23739a;
            if (str == null) {
                kVar.v(1);
            } else {
                kVar.q(1, str);
            }
            c0 c0Var = c0.f23699a;
            kVar.G(2, c0.j(vVar.f23740b));
            String str2 = vVar.f23741c;
            if (str2 == null) {
                kVar.v(3);
            } else {
                kVar.q(3, str2);
            }
            String str3 = vVar.f23742d;
            if (str3 == null) {
                kVar.v(4);
            } else {
                kVar.q(4, str3);
            }
            byte[] bArrN = androidx.work.b.n(vVar.f23743e);
            if (bArrN == null) {
                kVar.v(5);
            } else {
                kVar.L(5, bArrN);
            }
            byte[] bArrN2 = androidx.work.b.n(vVar.f23744f);
            if (bArrN2 == null) {
                kVar.v(6);
            } else {
                kVar.L(6, bArrN2);
            }
            kVar.G(7, vVar.f23745g);
            kVar.G(8, vVar.f23746h);
            kVar.G(9, vVar.f23747i);
            kVar.G(10, vVar.f23749k);
            kVar.G(11, c0.a(vVar.f23750l));
            kVar.G(12, vVar.f23751m);
            kVar.G(13, vVar.f23752n);
            kVar.G(14, vVar.f23753o);
            kVar.G(15, vVar.f23754p);
            kVar.G(16, vVar.f23755q ? 1L : 0L);
            kVar.G(17, c0.h(vVar.f23756r));
            kVar.G(18, vVar.g());
            kVar.G(19, vVar.f());
            b1.b bVar = vVar.f23748j;
            if (bVar != null) {
                kVar.G(20, c0.g(bVar.d()));
                kVar.G(21, bVar.g() ? 1L : 0L);
                kVar.G(22, bVar.h() ? 1L : 0L);
                kVar.G(23, bVar.f() ? 1L : 0L);
                kVar.G(24, bVar.i() ? 1L : 0L);
                kVar.G(25, bVar.b());
                kVar.G(26, bVar.a());
                byte[] bArrI = c0.i(bVar.c());
                if (bArrI != null) {
                    kVar.L(27, bArrI);
                    return;
                }
            } else {
                kVar.v(20);
                kVar.v(21);
                kVar.v(22);
                kVar.v(23);
                kVar.v(24);
                kVar.v(25);
                kVar.v(26);
            }
            kVar.v(27);
        }
    }

    class f extends q0.f {
        f(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    class g extends q0.m {
        g(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class h extends q0.m {
        h(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class i extends q0.m {
        i(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class j extends q0.m {
        j(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class k extends q0.m {
        k(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class l extends q0.m {
        l(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    class m extends q0.m {
        m(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public x(i0 i0Var) {
        this.f23761a = i0Var;
        this.f23762b = new e(i0Var);
        this.f23763c = new f(i0Var);
        this.f23764d = new g(i0Var);
        this.f23765e = new h(i0Var);
        this.f23766f = new i(i0Var);
        this.f23767g = new j(i0Var);
        this.f23768h = new k(i0Var);
        this.f23769i = new l(i0Var);
        this.f23770j = new m(i0Var);
        this.f23771k = new a(i0Var);
        this.f23772l = new b(i0Var);
        this.f23773m = new c(i0Var);
        this.f23774n = new d(i0Var);
    }

    public static List w() {
        return Collections.emptyList();
    }

    @Override // g1.w
    public void a(String str) {
        this.f23761a.d();
        u0.k kVarA = this.f23764d.a();
        if (str == null) {
            kVarA.v(1);
        } else {
            kVarA.q(1, str);
        }
        this.f23761a.e();
        try {
            kVarA.t();
            this.f23761a.B();
        } finally {
            this.f23761a.i();
            this.f23764d.f(kVarA);
        }
    }

    @Override // g1.w
    public void b(v vVar) {
        this.f23761a.d();
        this.f23761a.e();
        try {
            this.f23762b.h(vVar);
            this.f23761a.B();
        } finally {
            this.f23761a.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0252 A[Catch: all -> 0x0298, TryCatch #0 {all -> 0x0298, blocks: (B:5:0x006b, B:6:0x00de, B:8:0x00e4, B:12:0x00f3, B:16:0x010c, B:20:0x011b, B:24:0x0127, B:28:0x0137, B:32:0x0182, B:34:0x01a4, B:36:0x01ae, B:38:0x01b8, B:40:0x01c2, B:42:0x01cc, B:44:0x01d6, B:46:0x01e0, B:57:0x020d, B:61:0x0220, B:65:0x022b, B:69:0x0236, B:73:0x0241, B:77:0x0256, B:78:0x0265, B:76:0x0252, B:27:0x0133, B:23:0x0123, B:19:0x0115, B:15:0x0106, B:11:0x00ed), top: B:88:0x006b }] */
    @Override // g1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.x.c():java.util.List");
    }

    @Override // g1.w
    public void d(String str) {
        this.f23761a.d();
        u0.k kVarA = this.f23766f.a();
        if (str == null) {
            kVarA.v(1);
        } else {
            kVarA.q(1, str);
        }
        this.f23761a.e();
        try {
            kVarA.t();
            this.f23761a.B();
        } finally {
            this.f23761a.i();
            this.f23766f.f(kVarA);
        }
    }

    @Override // g1.w
    public boolean e() {
        boolean z10 = false;
        q0.l lVarE = q0.l.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f23761a.d();
        Cursor cursorD = s0.c.d(this.f23761a, lVarE, false, null);
        try {
            if (cursorD.moveToFirst()) {
                if (cursorD.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    @Override // g1.w
    public int f(String str, long j10) {
        this.f23761a.d();
        u0.k kVarA = this.f23771k.a();
        kVarA.G(1, j10);
        if (str == null) {
            kVarA.v(2);
        } else {
            kVarA.q(2, str);
        }
        this.f23761a.e();
        try {
            int iT = kVarA.t();
            this.f23761a.B();
            return iT;
        } finally {
            this.f23761a.i();
            this.f23771k.f(kVarA);
        }
    }

    @Override // g1.w
    public List g(String str) {
        q0.l lVarE = q0.l.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23761a.d();
        Cursor cursorD = s0.c.d(this.f23761a, lVarE, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorD.getCount());
            while (cursorD.moveToNext()) {
                arrayList.add(cursorD.isNull(0) ? null : cursorD.getString(0));
            }
            return arrayList;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    @Override // g1.w
    public List h(String str) {
        q0.l lVarE = q0.l.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23761a.d();
        Cursor cursorD = s0.c.d(this.f23761a, lVarE, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorD.getCount());
            while (cursorD.moveToNext()) {
                String string = cursorD.isNull(0) ? null : cursorD.getString(0);
                int i10 = cursorD.getInt(1);
                c0 c0Var = c0.f23699a;
                arrayList.add(new v.b(string, c0.f(i10)));
            }
            return arrayList;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0256 A[Catch: all -> 0x029c, TryCatch #0 {all -> 0x029c, blocks: (B:5:0x0071, B:6:0x00e4, B:8:0x00ea, B:12:0x00f9, B:16:0x0112, B:20:0x0121, B:24:0x012d, B:28:0x013d, B:32:0x0186, B:34:0x01a8, B:36:0x01b2, B:38:0x01bc, B:40:0x01c6, B:42:0x01d0, B:44:0x01da, B:46:0x01e4, B:57:0x0211, B:61:0x0224, B:65:0x022f, B:69:0x023a, B:73:0x0245, B:77:0x025a, B:78:0x0269, B:76:0x0256, B:27:0x0139, B:23:0x0129, B:19:0x011b, B:15:0x010c, B:11:0x00f3), top: B:88:0x0071 }] */
    @Override // g1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List i(long r71) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.x.i(long):java.util.List");
    }

    @Override // g1.w
    public b1.t j(String str) {
        q0.l lVarE = q0.l.e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23761a.d();
        b1.t tVarF = null;
        Cursor cursorD = s0.c.d(this.f23761a, lVarE, false, null);
        try {
            if (cursorD.moveToFirst()) {
                Integer numValueOf = cursorD.isNull(0) ? null : Integer.valueOf(cursorD.getInt(0));
                if (numValueOf != null) {
                    c0 c0Var = c0.f23699a;
                    tVarF = c0.f(numValueOf.intValue());
                }
            }
            return tVarF;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0257 A[Catch: all -> 0x029d, TryCatch #0 {all -> 0x029d, blocks: (B:5:0x0072, B:6:0x00e5, B:8:0x00eb, B:12:0x00fa, B:16:0x0113, B:20:0x0122, B:24:0x012e, B:28:0x013e, B:32:0x0187, B:34:0x01a9, B:36:0x01b3, B:38:0x01bd, B:40:0x01c7, B:42:0x01d1, B:44:0x01db, B:46:0x01e5, B:57:0x0212, B:61:0x0225, B:65:0x0230, B:69:0x023b, B:73:0x0246, B:77:0x025b, B:78:0x026a, B:76:0x0257, B:27:0x013a, B:23:0x012a, B:19:0x011c, B:15:0x010d, B:11:0x00f4), top: B:88:0x0072 }] */
    @Override // g1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List k(int r71) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.x.k(int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b A[Catch: all -> 0x023c, TryCatch #0 {all -> 0x023c, blocks: (B:9:0x0077, B:11:0x00e3, B:15:0x00f2, B:19:0x010b, B:23:0x011a, B:27:0x0126, B:31:0x0136, B:35:0x0175, B:37:0x0191, B:39:0x0199, B:41:0x01a1, B:43:0x01a9, B:45:0x01b1, B:47:0x01b9, B:49:0x01c1, B:80:0x022c, B:59:0x01d7, B:63:0x01ea, B:67:0x01f5, B:71:0x0200, B:75:0x020b, B:79:0x021f, B:78:0x021b, B:30:0x0132, B:26:0x0122, B:22:0x0114, B:18:0x0105, B:14:0x00ec), top: B:91:0x0077 }] */
    @Override // g1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g1.v l(java.lang.String r58) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.x.l(java.lang.String):g1.v");
    }

    @Override // g1.w
    public int m(String str) {
        this.f23761a.d();
        u0.k kVarA = this.f23770j.a();
        if (str == null) {
            kVarA.v(1);
        } else {
            kVarA.q(1, str);
        }
        this.f23761a.e();
        try {
            int iT = kVarA.t();
            this.f23761a.B();
            return iT;
        } finally {
            this.f23761a.i();
            this.f23770j.f(kVarA);
        }
    }

    @Override // g1.w
    public void n(String str, long j10) {
        this.f23761a.d();
        u0.k kVarA = this.f23768h.a();
        kVarA.G(1, j10);
        if (str == null) {
            kVarA.v(2);
        } else {
            kVarA.q(2, str);
        }
        this.f23761a.e();
        try {
            kVarA.t();
            this.f23761a.B();
        } finally {
            this.f23761a.i();
            this.f23768h.f(kVarA);
        }
    }

    @Override // g1.w
    public int o(b1.t tVar, String str) {
        this.f23761a.d();
        u0.k kVarA = this.f23765e.a();
        c0 c0Var = c0.f23699a;
        kVarA.G(1, c0.j(tVar));
        if (str == null) {
            kVarA.v(2);
        } else {
            kVarA.q(2, str);
        }
        this.f23761a.e();
        try {
            int iT = kVarA.t();
            this.f23761a.B();
            return iT;
        } finally {
            this.f23761a.i();
            this.f23765e.f(kVarA);
        }
    }

    @Override // g1.w
    public List p(String str) {
        q0.l lVarE = q0.l.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23761a.d();
        Cursor cursorD = s0.c.d(this.f23761a, lVarE, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorD.getCount());
            while (cursorD.moveToNext()) {
                arrayList.add(cursorD.isNull(0) ? null : cursorD.getString(0));
            }
            return arrayList;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    @Override // g1.w
    public List q(String str) {
        q0.l lVarE = q0.l.e("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23761a.d();
        Cursor cursorD = s0.c.d(this.f23761a, lVarE, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorD.getCount());
            while (cursorD.moveToNext()) {
                arrayList.add(androidx.work.b.g(cursorD.isNull(0) ? null : cursorD.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    @Override // g1.w
    public int r(String str) {
        this.f23761a.d();
        u0.k kVarA = this.f23769i.a();
        if (str == null) {
            kVarA.v(1);
        } else {
            kVarA.q(1, str);
        }
        this.f23761a.e();
        try {
            int iT = kVarA.t();
            this.f23761a.B();
            return iT;
        } finally {
            this.f23761a.i();
            this.f23769i.f(kVarA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0252 A[Catch: all -> 0x0298, TryCatch #0 {all -> 0x0298, blocks: (B:5:0x006b, B:6:0x00de, B:8:0x00e4, B:12:0x00f3, B:16:0x010c, B:20:0x011b, B:24:0x0127, B:28:0x0137, B:32:0x0182, B:34:0x01a4, B:36:0x01ae, B:38:0x01b8, B:40:0x01c2, B:42:0x01cc, B:44:0x01d6, B:46:0x01e0, B:57:0x020d, B:61:0x0220, B:65:0x022b, B:69:0x0236, B:73:0x0241, B:77:0x0256, B:78:0x0265, B:76:0x0252, B:27:0x0133, B:23:0x0123, B:19:0x0115, B:15:0x0106, B:11:0x00ed), top: B:88:0x006b }] */
    @Override // g1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List s() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.x.s():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0257 A[Catch: all -> 0x029d, TryCatch #0 {all -> 0x029d, blocks: (B:5:0x0072, B:6:0x00e5, B:8:0x00eb, B:12:0x00fa, B:16:0x0113, B:20:0x0122, B:24:0x012e, B:28:0x013e, B:32:0x0187, B:34:0x01a9, B:36:0x01b3, B:38:0x01bd, B:40:0x01c7, B:42:0x01d1, B:44:0x01db, B:46:0x01e5, B:57:0x0212, B:61:0x0225, B:65:0x0230, B:69:0x023b, B:73:0x0246, B:77:0x025b, B:78:0x026a, B:76:0x0257, B:27:0x013a, B:23:0x012a, B:19:0x011c, B:15:0x010d, B:11:0x00f4), top: B:88:0x0072 }] */
    @Override // g1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List t(int r71) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.x.t(int):java.util.List");
    }

    @Override // g1.w
    public void u(String str, androidx.work.b bVar) throws Throwable {
        this.f23761a.d();
        u0.k kVarA = this.f23767g.a();
        byte[] bArrN = androidx.work.b.n(bVar);
        if (bArrN == null) {
            kVarA.v(1);
        } else {
            kVarA.L(1, bArrN);
        }
        if (str == null) {
            kVarA.v(2);
        } else {
            kVarA.q(2, str);
        }
        this.f23761a.e();
        try {
            kVarA.t();
            this.f23761a.B();
        } finally {
            this.f23761a.i();
            this.f23767g.f(kVarA);
        }
    }

    @Override // g1.w
    public int v() {
        this.f23761a.d();
        u0.k kVarA = this.f23772l.a();
        this.f23761a.e();
        try {
            int iT = kVarA.t();
            this.f23761a.B();
            return iT;
        } finally {
            this.f23761a.i();
            this.f23772l.f(kVarA);
        }
    }
}
