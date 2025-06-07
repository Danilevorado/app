package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.n1;
import com.google.android.gms.measurement.internal.w4;
import com.google.firebase.analytics.FirebaseAnalytics;
import e4.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x4.w;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f19726b;

    /* renamed from: a, reason: collision with root package name */
    private final d f19727a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            p.l(bundle);
            this.mAppId = (String) x4.p.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) x4.p.a(bundle, "origin", String.class, null);
            this.mName = (String) x4.p.a(bundle, "name", String.class, null);
            this.mValue = x4.p.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) x4.p.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) x4.p.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) x4.p.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) x4.p.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) x4.p.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) x4.p.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) x4.p.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) x4.p.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) x4.p.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) x4.p.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) x4.p.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) x4.p.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(w4 w4Var) {
        this.f19727a = new a(w4Var);
    }

    public AppMeasurement(w wVar) {
        this.f19727a = new b(wVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f19726b == null) {
            synchronized (AppMeasurement.class) {
                if (f19726b == null) {
                    w wVar = (w) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (wVar != null) {
                        f19726b = new AppMeasurement(wVar);
                    } else {
                        f19726b = new AppMeasurement(w4.H(context, new n1(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f19726b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f19727a.M(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f19727a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f19727a.y0(str);
    }

    @Keep
    public long generateEventId() {
        return this.f19727a.b();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f19727a.g();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listC = this.f19727a.c(str, str2);
        ArrayList arrayList = new ArrayList(listC == null ? 0 : listC.size());
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f19727a.i();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f19727a.j();
    }

    @Keep
    public String getGmpAppId() {
        return this.f19727a.k();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f19727a.o(str);
    }

    @VisibleForTesting
    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f19727a.d(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f19727a.f(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        p.l(conditionalUserProperty);
        d dVar = this.f19727a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            x4.p.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        dVar.e(bundle);
    }
}
