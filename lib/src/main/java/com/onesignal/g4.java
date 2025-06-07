package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.e3;
import com.onesignal.p3;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class g4 {

    /* renamed from: i, reason: collision with root package name */
    private static int f22034i = -99;

    /* renamed from: j, reason: collision with root package name */
    private static Class f22035j;

    /* renamed from: a, reason: collision with root package name */
    private ServiceConnection f22036a;

    /* renamed from: b, reason: collision with root package name */
    private Object f22037b;

    /* renamed from: c, reason: collision with root package name */
    private Method f22038c;

    /* renamed from: d, reason: collision with root package name */
    private Method f22039d;

    /* renamed from: e, reason: collision with root package name */
    private Context f22040e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22042g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22043h = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f22041f = new ArrayList();

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Method methodQ = g4.q(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                methodQ.setAccessible(true);
                g4.this.f22037b = methodQ.invoke(null, iBinder);
                g4.this.b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            int unused = g4.f22034i = -99;
            g4.this.f22037b = null;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g4.this.f22043h = true;
            try {
                if (g4.this.f22038c == null) {
                    g4.this.f22038c = g4.r(g4.f22035j);
                    g4.this.f22038c.setAccessible(true);
                }
                Bundle bundle = (Bundle) g4.this.f22038c.invoke(g4.this.f22037b, 3, g4.this.f22040e.getPackageName(), "inapp", null);
                if (bundle.getInt("RESPONSE_CODE") == 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                        String str = stringArrayList2.get(i10);
                        String str2 = stringArrayList.get(i10);
                        String string = new JSONObject(str).getString("purchaseToken");
                        if (!g4.this.f22041f.contains(string) && !arrayList2.contains(string)) {
                            arrayList2.add(string);
                            arrayList.add(str2);
                        }
                    }
                    if (arrayList.size() > 0) {
                        g4.this.t(arrayList, arrayList2);
                    } else if (stringArrayList2.size() == 0) {
                        g4.this.f22042g = false;
                        n3.j("GTPlayerPurchases", "ExistingPurchases", false);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            g4.this.f22043h = false;
        }
    }

    class c extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f22046a;

        c(ArrayList arrayList) {
            this.f22046a = arrayList;
        }

        @Override // com.onesignal.p3.g
        public void b(String str) {
            g4.this.f22041f.addAll(this.f22046a);
            n3.m("GTPlayerPurchases", "purchaseTokens", g4.this.f22041f.toString());
            n3.j("GTPlayerPurchases", "ExistingPurchases", true);
            g4.this.f22042g = false;
            g4.this.f22043h = false;
        }
    }

    g4(Context context) {
        this.f22042g = true;
        this.f22040e = context;
        try {
            JSONArray jSONArray = new JSONArray(n3.f("GTPlayerPurchases", "purchaseTokens", "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f22041f.add(jSONArray.get(i10).toString());
            }
            boolean z10 = jSONArray.length() == 0;
            this.f22042g = z10;
            if (z10) {
                this.f22042g = n3.b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        u();
    }

    static boolean a(Context context) {
        if (f22034i == -99) {
            f22034i = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (f22034i == 0) {
                f22035j = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            return f22034i == 0;
        } catch (Throwable unused) {
            f22034i = 0;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f22043h) {
            return;
        }
        new Thread(new b()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method q(Class cls) throws SecurityException {
        for (Method method : cls.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method r(Class cls) throws SecurityException {
        for (Method method : cls.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class) {
                return method;
            }
        }
        return null;
    }

    private static Method s(Class cls) throws SecurityException {
        for (Method method : cls.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(ArrayList arrayList, ArrayList arrayList2) {
        try {
            if (this.f22039d == null) {
                Method methodS = s(f22035j);
                this.f22039d = methodS;
                methodS.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) this.f22039d.invoke(this.f22037b, 3, this.f22040e.getPackageName(), "inapp", bundle);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap map = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal bigDecimalDivide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", bigDecimalDivide.toString());
                    map.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (map.containsKey(str)) {
                        jSONArray.put(map.get(str));
                    }
                }
                if (jSONArray.length() > 0) {
                    e3.D1(jSONArray, this.f22042g, new c(arrayList2));
                }
            }
        } catch (Throwable th) {
            e3.b(e3.z.WARN, "Failed to track IAP purchases", th);
        }
    }

    void u() {
        if (this.f22036a != null) {
            if (this.f22037b != null) {
                b();
            }
        } else {
            this.f22036a = new a();
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f22040e.bindService(intent, this.f22036a, 1);
        }
    }
}
