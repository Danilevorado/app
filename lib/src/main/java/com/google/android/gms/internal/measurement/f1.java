package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes.dex */
public interface f1 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(i1 i1Var);

    void getAppInstanceId(i1 i1Var);

    void getCachedAppInstanceId(i1 i1Var);

    void getConditionalUserProperties(String str, String str2, i1 i1Var);

    void getCurrentScreenClass(i1 i1Var);

    void getCurrentScreenName(i1 i1Var);

    void getGmpAppId(i1 i1Var);

    void getMaxUserProperties(String str, i1 i1Var);

    void getTestFlag(i1 i1Var, int i10);

    void getUserProperties(String str, String str2, boolean z10, i1 i1Var);

    void initForTests(Map map);

    void initialize(l4.a aVar, n1 n1Var, long j10);

    void isDataCollectionEnabled(i1 i1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, i1 i1Var, long j10);

    void logHealthData(int i10, String str, l4.a aVar, l4.a aVar2, l4.a aVar3);

    void onActivityCreated(l4.a aVar, Bundle bundle, long j10);

    void onActivityDestroyed(l4.a aVar, long j10);

    void onActivityPaused(l4.a aVar, long j10);

    void onActivityResumed(l4.a aVar, long j10);

    void onActivitySaveInstanceState(l4.a aVar, i1 i1Var, long j10);

    void onActivityStarted(l4.a aVar, long j10);

    void onActivityStopped(l4.a aVar, long j10);

    void performAction(Bundle bundle, i1 i1Var, long j10);

    void registerOnMeasurementEventListener(k1 k1Var);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(l4.a aVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(k1 k1Var);

    void setInstanceIdProvider(m1 m1Var);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, l4.a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(k1 k1Var);
}
