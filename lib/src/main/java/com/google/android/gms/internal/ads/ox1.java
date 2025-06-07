package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ox1 extends px1 {

    /* renamed from: h, reason: collision with root package name */
    private static final SparseArray f13444h;

    /* renamed from: c, reason: collision with root package name */
    private final Context f13445c;

    /* renamed from: d, reason: collision with root package name */
    private final o01 f13446d;

    /* renamed from: e, reason: collision with root package name */
    private final TelephonyManager f13447e;

    /* renamed from: f, reason: collision with root package name */
    private final ex1 f13448f;

    /* renamed from: g, reason: collision with root package name */
    private int f13449g;

    static {
        SparseArray sparseArray = new SparseArray();
        f13444h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), fp.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        fp fpVar = fp.CONNECTING;
        sparseArray.put(iOrdinal, fpVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), fpVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), fpVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), fp.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        fp fpVar2 = fp.DISCONNECTED;
        sparseArray.put(iOrdinal2, fpVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), fpVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), fpVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), fpVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), fpVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), fp.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), fpVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), fpVar);
    }

    ox1(Context context, o01 o01Var, ex1 ex1Var, ax1 ax1Var, m3.p1 p1Var) {
        super(ax1Var, p1Var);
        this.f13445c = context;
        this.f13446d = o01Var;
        this.f13448f = ex1Var;
        this.f13447e = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ vo b(ox1 ox1Var, Bundle bundle) {
        oo ooVarK = vo.K();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        int i12 = 2;
        if (i10 == -1) {
            ox1Var.f13449g = 2;
        } else {
            ox1Var.f13449g = 1;
            if (i10 == 0) {
                ooVarK.v(2);
            } else if (i10 != 1) {
                ooVarK.v(1);
            } else {
                ooVarK.v(3);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                case 12:
                case 14:
                case 15:
                case 17:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 5;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            ooVarK.u(i12);
        }
        return (vo) ooVarK.m();
    }

    static /* bridge */ /* synthetic */ fp c(ox1 ox1Var, Bundle bundle) {
        return (fp) f13444h.get(qo2.a(qo2.a(bundle, "device"), "network").getInt("active_network_state", -1), fp.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] f(ox1 ox1Var, boolean z10, ArrayList arrayList, vo voVar, fp fpVar) {
        ap apVarS = bp.S();
        apVarS.u(arrayList);
        apVarS.D(g(Settings.Global.getInt(ox1Var.f13445c.getContentResolver(), "airplane_mode_on", 0) != 0));
        apVarS.E(j3.t.s().h(ox1Var.f13445c, ox1Var.f13447e));
        apVarS.A(ox1Var.f13448f.e());
        apVarS.z(ox1Var.f13448f.b());
        apVarS.v(ox1Var.f13448f.a());
        apVarS.w(fpVar);
        apVarS.y(voVar);
        apVarS.F(ox1Var.f13449g);
        apVarS.G(g(z10));
        apVarS.C(ox1Var.f13448f.d());
        apVarS.B(j3.t.b().a());
        apVarS.H(g(Settings.Global.getInt(ox1Var.f13445c.getContentResolver(), "wifi_on", 0) != 0));
        return ((bp) apVarS.m()).x();
    }

    private static final int g(boolean z10) {
        return z10 ? 2 : 1;
    }

    public final void e(boolean z10) {
        qa3.q(this.f13446d.b(), new nx1(this, z10), of0.f13191f);
    }
}
