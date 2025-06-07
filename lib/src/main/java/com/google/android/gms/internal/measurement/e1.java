package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.HashMap;
import l4.a;

/* loaded from: classes.dex */
public abstract class e1 extends p0 implements f1 {
    public e1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static f1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof f1 ? (f1) iInterfaceQueryLocalInterface : new d1(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    protected final boolean C(int i10, Parcel parcel, Parcel parcel2, int i11) {
        i1 g1Var;
        i1 g1Var2 = null;
        i1 g1Var3 = null;
        i1 g1Var4 = null;
        k1 j1Var = null;
        k1 j1Var2 = null;
        k1 j1Var3 = null;
        i1 g1Var5 = null;
        i1 g1Var6 = null;
        i1 g1Var7 = null;
        i1 g1Var8 = null;
        i1 g1Var9 = null;
        i1 g1Var10 = null;
        m1 l1Var = null;
        i1 g1Var11 = null;
        i1 g1Var12 = null;
        i1 g1Var13 = null;
        i1 g1Var14 = null;
        switch (i10) {
            case 1:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                n1 n1Var = (n1) q0.a(parcel, n1.CREATOR);
                long j10 = parcel.readLong();
                q0.c(parcel);
                initialize(aVarW0, n1Var, j10);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) q0.a(parcel, Bundle.CREATOR);
                boolean zG = q0.g(parcel);
                boolean zG2 = q0.g(parcel);
                long j11 = parcel.readLong();
                q0.c(parcel);
                logEvent(string, string2, bundle, zG, zG2, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    g1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var = iInterfaceQueryLocalInterface instanceof i1 ? (i1) iInterfaceQueryLocalInterface : new g1(strongBinder);
                }
                long j12 = parcel.readLong();
                q0.c(parcel);
                logEventAndBundle(string3, string4, bundle2, g1Var, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                boolean zG3 = q0.g(parcel);
                long j13 = parcel.readLong();
                q0.c(parcel);
                setUserProperty(string5, string6, aVarW02, zG3, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zG4 = q0.g(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var2 = iInterfaceQueryLocalInterface2 instanceof i1 ? (i1) iInterfaceQueryLocalInterface2 : new g1(strongBinder2);
                }
                q0.c(parcel);
                getUserProperties(string7, string8, zG4, g1Var2);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var14 = iInterfaceQueryLocalInterface3 instanceof i1 ? (i1) iInterfaceQueryLocalInterface3 : new g1(strongBinder3);
                }
                q0.c(parcel);
                getMaxUserProperties(string9, g1Var14);
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                q0.c(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                q0.c(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                q0.c(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var13 = iInterfaceQueryLocalInterface4 instanceof i1 ? (i1) iInterfaceQueryLocalInterface4 : new g1(strongBinder4);
                }
                q0.c(parcel);
                getConditionalUserProperties(string13, string14, g1Var13);
                break;
            case 11:
                boolean zG5 = q0.g(parcel);
                long j16 = parcel.readLong();
                q0.c(parcel);
                setMeasurementEnabled(zG5, j16);
                break;
            case 12:
                long j17 = parcel.readLong();
                q0.c(parcel);
                resetAnalyticsData(j17);
                break;
            case 13:
                long j18 = parcel.readLong();
                q0.c(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                q0.c(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case 15:
                l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j20 = parcel.readLong();
                q0.c(parcel);
                setCurrentScreen(aVarW03, string15, string16, j20);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var12 = iInterfaceQueryLocalInterface5 instanceof i1 ? (i1) iInterfaceQueryLocalInterface5 : new g1(strongBinder5);
                }
                q0.c(parcel);
                getCurrentScreenName(g1Var12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var11 = iInterfaceQueryLocalInterface6 instanceof i1 ? (i1) iInterfaceQueryLocalInterface6 : new g1(strongBinder6);
                }
                q0.c(parcel);
                getCurrentScreenClass(g1Var11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    l1Var = iInterfaceQueryLocalInterface7 instanceof m1 ? (m1) iInterfaceQueryLocalInterface7 : new l1(strongBinder7);
                }
                q0.c(parcel);
                setInstanceIdProvider(l1Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var10 = iInterfaceQueryLocalInterface8 instanceof i1 ? (i1) iInterfaceQueryLocalInterface8 : new g1(strongBinder8);
                }
                q0.c(parcel);
                getCachedAppInstanceId(g1Var10);
                break;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var9 = iInterfaceQueryLocalInterface9 instanceof i1 ? (i1) iInterfaceQueryLocalInterface9 : new g1(strongBinder9);
                }
                q0.c(parcel);
                getAppInstanceId(g1Var9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var8 = iInterfaceQueryLocalInterface10 instanceof i1 ? (i1) iInterfaceQueryLocalInterface10 : new g1(strongBinder10);
                }
                q0.c(parcel);
                getGmpAppId(g1Var8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var7 = iInterfaceQueryLocalInterface11 instanceof i1 ? (i1) iInterfaceQueryLocalInterface11 : new g1(strongBinder11);
                }
                q0.c(parcel);
                generateEventId(g1Var7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j21 = parcel.readLong();
                q0.c(parcel);
                beginAdUnitExposure(string17, j21);
                break;
            case 24:
                String string18 = parcel.readString();
                long j22 = parcel.readLong();
                q0.c(parcel);
                endAdUnitExposure(string18, j22);
                break;
            case 25:
                l4.a aVarW04 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                q0.c(parcel);
                onActivityStarted(aVarW04, j23);
                break;
            case 26:
                l4.a aVarW05 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                q0.c(parcel);
                onActivityStopped(aVarW05, j24);
                break;
            case 27:
                l4.a aVarW06 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                q0.c(parcel);
                onActivityCreated(aVarW06, bundle5, j25);
                break;
            case 28:
                l4.a aVarW07 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                q0.c(parcel);
                onActivityDestroyed(aVarW07, j26);
                break;
            case 29:
                l4.a aVarW08 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                q0.c(parcel);
                onActivityPaused(aVarW08, j27);
                break;
            case 30:
                l4.a aVarW09 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                q0.c(parcel);
                onActivityResumed(aVarW09, j28);
                break;
            case 31:
                l4.a aVarW010 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var6 = iInterfaceQueryLocalInterface12 instanceof i1 ? (i1) iInterfaceQueryLocalInterface12 : new g1(strongBinder12);
                }
                long j29 = parcel.readLong();
                q0.c(parcel);
                onActivitySaveInstanceState(aVarW010, g1Var6, j29);
                break;
            case 32:
                Bundle bundle6 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var5 = iInterfaceQueryLocalInterface13 instanceof i1 ? (i1) iInterfaceQueryLocalInterface13 : new g1(strongBinder13);
                }
                long j30 = parcel.readLong();
                q0.c(parcel);
                performAction(bundle6, g1Var5, j30);
                break;
            case 33:
                int i12 = parcel.readInt();
                String string19 = parcel.readString();
                l4.a aVarW011 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                l4.a aVarW012 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                l4.a aVarW013 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                q0.c(parcel);
                logHealthData(i12, string19, aVarW011, aVarW012, aVarW013);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    j1Var3 = iInterfaceQueryLocalInterface14 instanceof k1 ? (k1) iInterfaceQueryLocalInterface14 : new j1(strongBinder14);
                }
                q0.c(parcel);
                setEventInterceptor(j1Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    j1Var2 = iInterfaceQueryLocalInterface15 instanceof k1 ? (k1) iInterfaceQueryLocalInterface15 : new j1(strongBinder15);
                }
                q0.c(parcel);
                registerOnMeasurementEventListener(j1Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    j1Var = iInterfaceQueryLocalInterface16 instanceof k1 ? (k1) iInterfaceQueryLocalInterface16 : new j1(strongBinder16);
                }
                q0.c(parcel);
                unregisterOnMeasurementEventListener(j1Var);
                break;
            case 37:
                HashMap mapB = q0.b(parcel);
                q0.c(parcel);
                initForTests(mapB);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var4 = iInterfaceQueryLocalInterface17 instanceof i1 ? (i1) iInterfaceQueryLocalInterface17 : new g1(strongBinder17);
                }
                int i13 = parcel.readInt();
                q0.c(parcel);
                getTestFlag(g1Var4, i13);
                break;
            case 39:
                boolean zG6 = q0.g(parcel);
                q0.c(parcel);
                setDataCollectionEnabled(zG6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var3 = iInterfaceQueryLocalInterface18 instanceof i1 ? (i1) iInterfaceQueryLocalInterface18 : new g1(strongBinder18);
                }
                q0.c(parcel);
                isDataCollectionEnabled(g1Var3);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                q0.c(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j31 = parcel.readLong();
                q0.c(parcel);
                clearMeasurementEnabled(j31);
                break;
            case 44:
                Bundle bundle8 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                q0.c(parcel);
                setConsent(bundle8, j32);
                break;
            case 45:
                Bundle bundle9 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                q0.c(parcel);
                setConsentThirdParty(bundle9, j33);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
