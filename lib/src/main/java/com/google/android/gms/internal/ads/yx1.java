package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yx1 {

    /* renamed from: a, reason: collision with root package name */
    private final pm f18307a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18308b;

    /* renamed from: c, reason: collision with root package name */
    private final ax1 f18309c;

    /* renamed from: d, reason: collision with root package name */
    private final ff0 f18310d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18311e;

    /* renamed from: f, reason: collision with root package name */
    private final ws2 f18312f;

    /* renamed from: g, reason: collision with root package name */
    private final m3.p1 f18313g = j3.t.q().h();

    public yx1(Context context, ff0 ff0Var, pm pmVar, ax1 ax1Var, String str, ws2 ws2Var) {
        this.f18308b = context;
        this.f18310d = ff0Var;
        this.f18307a = pmVar;
        this.f18309c = ax1Var;
        this.f18311e = str;
        this.f18312f = ws2Var;
    }

    private static final void c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jQ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            bp bpVar = (bp) arrayList.get(i10);
            if (bpVar.i0() == 2 && bpVar.Q() > jQ) {
                jQ = bpVar.Q();
            }
        }
        if (jQ != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jQ));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    final /* synthetic */ Void a(boolean z10, SQLiteDatabase sQLiteDatabase) {
        if (z10) {
            this.f18308b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
            vs2 vs2VarB = vs2.b("oa_upload");
            vs2VarB.a("oa_failed_reqs", String.valueOf(rx1.a(sQLiteDatabase, 0)));
            vs2VarB.a("oa_total_reqs", String.valueOf(rx1.a(sQLiteDatabase, 1)));
            vs2VarB.a("oa_upload_time", String.valueOf(j3.t.b().a()));
            vs2VarB.a("oa_last_successful_time", String.valueOf(rx1.b(sQLiteDatabase, 2)));
            vs2VarB.a("oa_session_id", this.f18313g.S() ? "" : this.f18311e);
            this.f18312f.a(vs2VarB);
            ArrayList arrayListC = rx1.c(sQLiteDatabase);
            c(sQLiteDatabase, arrayListC);
            int size = arrayListC.size();
            for (int i10 = 0; i10 < size; i10++) {
                bp bpVar = (bp) arrayListC.get(i10);
                vs2 vs2VarB2 = vs2.b("oa_signals");
                vs2VarB2.a("oa_session_id", this.f18313g.S() ? "" : this.f18311e);
                vo voVarR = bpVar.R();
                String strValueOf = voVarR.O() ? String.valueOf(voVarR.Q() - 1) : "-1";
                String string = q63.b(bpVar.W(), new w23() { // from class: com.google.android.gms.internal.ads.xx1
                    @Override // com.google.android.gms.internal.ads.w23
                    public final Object a(Object obj) {
                        return ((on) obj).name();
                    }
                }).toString();
                vs2VarB2.a("oa_sig_ts", String.valueOf(bpVar.Q()));
                vs2VarB2.a("oa_sig_status", String.valueOf(bpVar.i0() - 1));
                vs2VarB2.a("oa_sig_resp_lat", String.valueOf(bpVar.P()));
                vs2VarB2.a("oa_sig_render_lat", String.valueOf(bpVar.O()));
                vs2VarB2.a("oa_sig_formats", string);
                vs2VarB2.a("oa_sig_nw_type", strValueOf);
                vs2VarB2.a("oa_sig_wifi", String.valueOf(bpVar.j0() - 1));
                vs2VarB2.a("oa_sig_airplane", String.valueOf(bpVar.f0() - 1));
                vs2VarB2.a("oa_sig_data", String.valueOf(bpVar.g0() - 1));
                vs2VarB2.a("oa_sig_nw_resp", String.valueOf(bpVar.N()));
                vs2VarB2.a("oa_sig_offline", String.valueOf(bpVar.h0() - 1));
                vs2VarB2.a("oa_sig_nw_state", String.valueOf(bpVar.V().a()));
                if (voVarR.N() && voVarR.O() && voVarR.Q() == 2) {
                    vs2VarB2.a("oa_sig_cell_type", String.valueOf(voVarR.P() - 1));
                }
                this.f18312f.a(vs2VarB2);
            }
        } else {
            ArrayList arrayListC2 = rx1.c(sQLiteDatabase);
            cp cpVarK = gp.K();
            cpVarK.v(this.f18308b.getPackageName());
            cpVarK.y(Build.MODEL);
            cpVarK.z(rx1.a(sQLiteDatabase, 0));
            cpVarK.u(arrayListC2);
            cpVarK.B(rx1.a(sQLiteDatabase, 1));
            cpVarK.w(rx1.a(sQLiteDatabase, 3));
            cpVarK.C(j3.t.b().a());
            cpVarK.A(rx1.b(sQLiteDatabase, 2));
            final gp gpVar = (gp) cpVarK.m();
            c(sQLiteDatabase, arrayListC2);
            this.f18307a.b(new om() { // from class: com.google.android.gms.internal.ads.vx1
                @Override // com.google.android.gms.internal.ads.om
                public final void a(go goVar) {
                    goVar.D(gpVar);
                }
            });
            rp rpVarK = sp.K();
            rpVarK.u(this.f18310d.f8253n);
            rpVarK.w(this.f18310d.f8254o);
            rpVarK.v(true == this.f18310d.f8255p ? 0 : 2);
            final sp spVar = (sp) rpVarK.m();
            this.f18307a.b(new om() { // from class: com.google.android.gms.internal.ads.wx1
                @Override // com.google.android.gms.internal.ads.om
                public final void a(go goVar) {
                    sp spVar2 = spVar;
                    xn xnVar = (xn) goVar.v().i();
                    xnVar.v(spVar2);
                    goVar.B(xnVar);
                }
            });
            this.f18307a.c(10004);
        }
        rx1.f(sQLiteDatabase);
        return null;
    }

    public final void b(final boolean z10) {
        try {
            this.f18309c.a(new nr2() { // from class: com.google.android.gms.internal.ads.ux1
                @Override // com.google.android.gms.internal.ads.nr2
                public final Object a(Object obj) {
                    this.f16489a.a(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e5) {
            ze0.d("Error in offline signals database startup: ".concat(String.valueOf(e5.getMessage())));
        }
    }
}
