package com.onesignal;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import androidx.core.app.l;
import com.facebook.ads.AdError;
import com.onesignal.e3;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static Class f22452a = NotificationOpenedReceiver.class;

    /* renamed from: b, reason: collision with root package name */
    private static Class f22453b = NotificationDismissReceiver.class;

    /* renamed from: c, reason: collision with root package name */
    private static Resources f22454c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Context f22455d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f22456e = null;

    /* renamed from: f, reason: collision with root package name */
    private static Integer f22457f = null;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        l.e f22458a;

        /* renamed from: b, reason: collision with root package name */
        boolean f22459b;

        private b() {
        }
    }

    private static int A(String str) {
        if (str == null) {
            return 0;
        }
        String strTrim = str.trim();
        if (!OSUtils.J(strTrim)) {
            return 0;
        }
        int iW = w(strTrim);
        if (iW != 0) {
            return iW;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int B(JSONObject jSONObject) {
        int iA = A(jSONObject.optString("sicon", null));
        return iA != 0 ? iA : v();
    }

    private static CharSequence C(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("title", null);
        return strOptString != null ? strOptString : p();
    }

    private static void D() {
        f22457f = Integer.valueOf(Build.VERSION.SDK_INT >= 24 ? 2 : 1);
    }

    static void E() {
        if (OSUtils.H()) {
            throw new v2("Process for showing a notification should never been done on Main Thread!");
        }
    }

    private static boolean F(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("sound", null);
        return ("null".equals(strOptString) || "nil".equals(strOptString)) ? false : true;
    }

    private static void G(l.e eVar) {
        eVar.C(true).q(0).G(null).J(null).I(null);
    }

    private static Bitmap H(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f22454c.getDimension(R.dimen.notification_large_icon_height);
            int dimension2 = (int) f22454c.getDimension(R.dimen.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (dimension * (width / height));
            } else if (width > height) {
                dimension = (int) (dimension2 * (height / width));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private static Integer I(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void J(JSONObject jSONObject, l.e eVar) {
        int iE = e(jSONObject.optInt("pri", 6));
        eVar.D(iE);
        int i10 = 0;
        if (iE < 0) {
            return;
        }
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                eVar.y(new BigInteger(jSONObject.optString("ledc"), 16).intValue(), AdError.SERVER_ERROR_CODE, 5000);
            } catch (Throwable unused) {
            }
        } else {
            i10 = 4;
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] jArrQ = OSUtils.Q(jSONObject);
                if (jArrQ != null) {
                    eVar.J(jArrQ);
                }
            } else {
                i10 |= 2;
            }
        }
        if (F(jSONObject)) {
            Uri uriN = OSUtils.n(f22455d, jSONObject.optString("sound", null));
            if (uriN != null) {
                eVar.G(uriN);
            } else {
                i10 |= 1;
            }
        }
        eVar.q(i10);
    }

    private static void K(Context context) {
        f22455d = context;
        f22456e = context.getPackageName();
        f22454c = f22455d.getResources();
    }

    private static void L(RemoteViews remoteViews, JSONObject jSONObject, int i10, String str, String str2) {
        int iB;
        Integer numI = I(jSONObject, str);
        if (numI != null) {
            iB = numI.intValue();
        } else {
            int identifier = f22454c.getIdentifier(str2, "color", f22456e);
            if (identifier == 0) {
                return;
            } else {
                iB = h.b(f22455d, identifier);
            }
        }
        remoteViews.setTextColor(i10, iB);
    }

    private static boolean M(x1 x1Var) throws Throwable {
        Notification notificationH;
        int iIntValue = x1Var.a().intValue();
        JSONObject jSONObjectE = x1Var.e();
        String strOptString = jSONObjectE.optString("grp", null);
        d0 d0Var = new d0(f22455d);
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList = m3.c(f22455d);
            if (strOptString == null && arrayList.size() >= 3) {
                strOptString = m3.g();
                m3.b(f22455d, arrayList);
            }
        }
        b bVarQ = q(x1Var);
        l.e eVar = bVarQ.f22458a;
        b(jSONObjectE, d0Var, eVar, iIntValue, null);
        try {
            a(jSONObjectE, eVar);
        } catch (Throwable th) {
            e3.b(e3.z.ERROR, "Could not set background notification image!", th);
        }
        d(x1Var, eVar);
        if (x1Var.n()) {
            G(eVar);
        }
        l0.a(f22455d, strOptString != null ? 2 : 1);
        if (strOptString != null) {
            g(eVar, d0Var, jSONObjectE, strOptString, iIntValue);
            notificationH = j(x1Var, eVar);
            if (Build.VERSION.SDK_INT < 24 || !strOptString.equals(m3.g())) {
                l(x1Var, bVarQ);
            } else {
                i(x1Var, d0Var, arrayList.size() + 1);
            }
        } else {
            notificationH = h(eVar, d0Var, jSONObjectE, iIntValue);
        }
        c(bVarQ, notificationH);
        androidx.core.app.o.e(f22455d).g(iIntValue, notificationH);
        if (Build.VERSION.SDK_INT >= 26) {
            return m3.a(f22455d, notificationH.getChannelId());
        }
        return true;
    }

    static void N(x1 x1Var) {
        K(x1Var.d());
        l(x1Var, null);
    }

    private static void a(JSONObject jSONObject, l.e eVar) throws JSONException {
        Bitmap bitmapS;
        JSONObject jSONObject2;
        String string;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            e3.a(e3.z.VERBOSE, "Cannot use background images in notifications for device on version: " + i10);
            return;
        }
        String strOptString = jSONObject.optString("bg_img", null);
        if (strOptString != null) {
            jSONObject2 = new JSONObject(strOptString);
            bitmapS = r(jSONObject2.optString("img", null));
        } else {
            bitmapS = null;
            jSONObject2 = null;
        }
        if (bitmapS == null) {
            bitmapS = s("onesignal_bgimage_default_image");
        }
        if (bitmapS != null) {
            RemoteViews remoteViews = new RemoteViews(f22455d.getPackageName(), b4.f21732a);
            int i11 = a4.f21701e;
            remoteViews.setTextViewText(i11, C(jSONObject));
            int i12 = a4.f21700d;
            remoteViews.setTextViewText(i12, jSONObject.optString("alert"));
            L(remoteViews, jSONObject2, i11, "tc", "onesignal_bgimage_notif_title_color");
            L(remoteViews, jSONObject2, i12, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                int identifier = f22454c.getIdentifier("onesignal_bgimage_notif_image_align", "string", f22456e);
                string = identifier != 0 ? f22454c.getString(identifier) : null;
            } else {
                string = jSONObject2.getString("img_align");
            }
            if ("right".equals(string)) {
                remoteViews.setViewPadding(a4.f21698b, -5000, 0, 0, 0);
                int i13 = a4.f21699c;
                remoteViews.setImageViewBitmap(i13, bitmapS);
                remoteViews.setViewVisibility(i13, 0);
                remoteViews.setViewVisibility(a4.f21697a, 2);
            } else {
                remoteViews.setImageViewBitmap(a4.f21697a, bitmapS);
            }
            eVar.m(remoteViews);
            eVar.H(null);
        }
    }

    private static void b(JSONObject jSONObject, d0 d0Var, l.e eVar, int i10, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent intentB = d0Var.b(i10);
                        intentB.setAction("" + i11);
                        intentB.putExtra("action_button", true);
                        jSONObject4.put("actionId", jSONObjectOptJSONObject.optString("id"));
                        intentB.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            intentB.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            intentB.putExtra("grp", jSONObject.optString("grp"));
                        }
                        eVar.a(jSONObjectOptJSONObject.has("icon") ? A(jSONObjectOptJSONObject.optString("icon")) : 0, jSONObjectOptJSONObject.optString("text"), d0Var.a(i10, intentB));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void c(b bVar, Notification notification) {
        if (bVar.f22459b) {
            try {
                Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = objNewInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(objNewInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, objNewInstance);
            } catch (Throwable unused) {
            }
        }
    }

    private static void d(x1 x1Var, l.e eVar) {
        if (x1Var.l()) {
            try {
                Field declaredField = l.e.class.getDeclaredField("R");
                declaredField.setAccessible(true);
                Notification notification = (Notification) declaredField.get(eVar);
                x1Var.s(Integer.valueOf(notification.flags));
                x1Var.t(notification.sound);
                eVar.d(x1Var.f().h());
                Notification notification2 = (Notification) declaredField.get(eVar);
                Field declaredField2 = l.e.class.getDeclaredField("f");
                declaredField2.setAccessible(true);
                CharSequence charSequence = (CharSequence) declaredField2.get(eVar);
                Field declaredField3 = l.e.class.getDeclaredField("e");
                declaredField3.setAccessible(true);
                CharSequence charSequence2 = (CharSequence) declaredField3.get(eVar);
                x1Var.u(charSequence);
                x1Var.x(charSequence2);
                if (x1Var.n()) {
                    return;
                }
                x1Var.v(Integer.valueOf(notification2.flags));
                x1Var.w(notification2.sound);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static int e(int i10) {
        if (i10 > 9) {
            return 2;
        }
        if (i10 > 7) {
            return 1;
        }
        if (i10 > 4) {
            return 0;
        }
        return i10 > 2 ? -1 : -2;
    }

    private static Intent f(int i10, d0 d0Var, JSONObject jSONObject, String str) {
        return d0Var.b(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
    }

    private static void g(l.e eVar, d0 d0Var, JSONObject jSONObject, String str, int i10) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.n(d0Var.a(secureRandom.nextInt(), d0Var.b(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str)));
        eVar.r(z(secureRandom.nextInt(), y(i10).putExtra("grp", str)));
        eVar.u(str);
        try {
            eVar.v(f22457f.intValue());
        } catch (Throwable unused) {
        }
    }

    private static Notification h(l.e eVar, d0 d0Var, JSONObject jSONObject, int i10) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.n(d0Var.a(secureRandom.nextInt(), d0Var.b(i10).putExtra("onesignalData", jSONObject.toString())));
        eVar.r(z(secureRandom.nextInt(), y(i10)));
        return eVar.c();
    }

    private static void i(x1 x1Var, d0 d0Var, int i10) {
        JSONObject jSONObjectE = x1Var.e();
        SecureRandom secureRandom = new SecureRandom();
        String strG = m3.g();
        String str = i10 + " new messages";
        int iF = m3.f();
        k(l3.x(f22455d), strG, iF);
        PendingIntent pendingIntentA = d0Var.a(secureRandom.nextInt(), f(iF, d0Var, jSONObjectE, strG));
        PendingIntent pendingIntentZ = z(secureRandom.nextInt(), y(0).putExtra("summary", strG));
        l.e eVar = q(x1Var).f22458a;
        if (x1Var.i() != null) {
            eVar.G(x1Var.i());
        }
        if (x1Var.h() != null) {
            eVar.q(x1Var.h().intValue());
        }
        eVar.n(pendingIntentA).r(pendingIntentZ).p(p()).o(str).A(i10).F(v()).x(u()).C(true).h(false).u(strG).w(true);
        try {
            eVar.v(f22457f.intValue());
        } catch (Throwable unused) {
        }
        l.g gVar = new l.g();
        gVar.i(str);
        eVar.H(gVar);
        androidx.core.app.o.e(f22455d).g(iF, eVar.c());
    }

    private static Notification j(x1 x1Var, l.e eVar) {
        boolean z10 = Build.VERSION.SDK_INT < 24 && !x1Var.n();
        if (z10 && x1Var.i() != null && !x1Var.i().equals(x1Var.g())) {
            eVar.G(null);
        }
        Notification notificationC = eVar.c();
        if (z10) {
            eVar.G(x1Var.i());
        }
        return notificationC;
    }

    private static void k(l3 l3Var, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf(i10));
        contentValues.put("group_id", str);
        contentValues.put("is_summary", (Integer) 1);
        l3Var.V("notification", null, contentValues);
    }

    private static void l(x1 x1Var, b bVar) throws Throwable {
        String str;
        JSONObject jSONObject;
        ArrayList arrayList;
        Integer numValueOf;
        Notification notificationC;
        CharSequence charSequenceReplace;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "message";
        String str7 = "title";
        String str8 = "is_summary";
        boolean zN = x1Var.n();
        JSONObject jSONObjectE = x1Var.e();
        d0 d0Var = new d0(f22455d);
        Cursor cursor = null;
        String strOptString = jSONObjectE.optString("grp", null);
        SecureRandom secureRandom = new SecureRandom();
        PendingIntent pendingIntentZ = z(secureRandom.nextInt(), y(0).putExtra("summary", strOptString));
        l3 l3VarX = l3.x(f22455d);
        try {
            String[] strArr = {"android_notification_id", "full_data", "is_summary", "title", "message"};
            try {
                String[] strArr2 = {strOptString};
                if (zN) {
                    str = "group_id = ? AND dismissed = 0 AND opened = 0";
                } else {
                    try {
                        str = "group_id = ? AND dismissed = 0 AND opened = 0 AND android_notification_id <> " + x1Var.a();
                    } catch (Throwable th) {
                        th = th;
                        cursor = null;
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Cursor cursorA = l3VarX.a("notification", strArr, str, strArr2, null, null, "_id DESC");
                try {
                    String str9 = "";
                    if (cursorA.moveToFirst()) {
                        arrayList = new ArrayList();
                        String string = null;
                        numValueOf = null;
                        while (true) {
                            String str10 = str8;
                            if (cursorA.getInt(cursorA.getColumnIndex(str8)) == 1) {
                                numValueOf = Integer.valueOf(cursorA.getInt(cursorA.getColumnIndex("android_notification_id")));
                                str3 = str6;
                                str4 = str7;
                            } else {
                                String string2 = cursorA.getString(cursorA.getColumnIndex(str7));
                                if (string2 == null) {
                                    str2 = "";
                                } else {
                                    str2 = string2 + " ";
                                }
                                str3 = str6;
                                str4 = str7;
                                SpannableString spannableString = new SpannableString(str2 + cursorA.getString(cursorA.getColumnIndex(str6)));
                                if (str2.length() > 0) {
                                    spannableString.setSpan(new StyleSpan(1), 0, str2.length(), 0);
                                }
                                arrayList.add(spannableString);
                                if (string == null) {
                                    string = cursorA.getString(cursorA.getColumnIndex("full_data"));
                                }
                            }
                            str5 = string;
                            if (!cursorA.moveToNext()) {
                                break;
                            }
                            string = str5;
                            str8 = str10;
                            str6 = str3;
                            str7 = str4;
                        }
                        if (!zN || str5 == null) {
                            jSONObject = jSONObjectE;
                        } else {
                            try {
                                jSONObject = new JSONObject(str5);
                            } catch (JSONException e5) {
                                e5.printStackTrace();
                            }
                        }
                    } else {
                        jSONObject = jSONObjectE;
                        arrayList = null;
                        numValueOf = null;
                    }
                    if (!cursorA.isClosed()) {
                        cursorA.close();
                    }
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(secureRandom.nextInt());
                        k(l3VarX, strOptString, numValueOf.intValue());
                    }
                    PendingIntent pendingIntentA = d0Var.a(secureRandom.nextInt(), f(numValueOf.intValue(), d0Var, jSONObject, strOptString));
                    if (arrayList == null || ((!zN || arrayList.size() <= 1) && (zN || arrayList.size() <= 0))) {
                        l.e eVar = bVar.f22458a;
                        eVar.f2071b.clear();
                        b(jSONObject, d0Var, eVar, numValueOf.intValue(), strOptString);
                        eVar.n(pendingIntentA).r(pendingIntentZ).C(zN).h(false).u(strOptString).w(true);
                        try {
                            eVar.v(f22457f.intValue());
                        } catch (Throwable unused) {
                        }
                        notificationC = eVar.c();
                        c(bVar, notificationC);
                    } else {
                        int size = arrayList.size() + (!zN ? 1 : 0);
                        String strOptString2 = jSONObject.optString("grp_msg", null);
                        if (strOptString2 == null) {
                            charSequenceReplace = size + " new messages";
                        } else {
                            charSequenceReplace = strOptString2.replace("$[notif_count]", "" + size);
                        }
                        l.e eVar2 = q(x1Var).f22458a;
                        if (zN) {
                            G(eVar2);
                        } else {
                            if (x1Var.i() != null) {
                                eVar2.G(x1Var.i());
                            }
                            if (x1Var.h() != null) {
                                eVar2.q(x1Var.h().intValue());
                            }
                        }
                        eVar2.n(pendingIntentA).r(pendingIntentZ).p(p()).o(charSequenceReplace).A(size).F(v()).x(u()).C(zN).h(false).u(strOptString).w(true);
                        try {
                            eVar2.v(f22457f.intValue());
                        } catch (Throwable unused2) {
                        }
                        if (!zN) {
                            eVar2.I(charSequenceReplace);
                        }
                        l.g gVar = new l.g();
                        if (!zN) {
                            String string3 = x1Var.k() != null ? x1Var.k().toString() : null;
                            if (string3 != null) {
                                str9 = string3 + " ";
                            }
                            SpannableString spannableString2 = new SpannableString(str9 + x1Var.c().toString());
                            if (str9.length() > 0) {
                                spannableString2.setSpan(new StyleSpan(1), 0, str9.length(), 0);
                            }
                            gVar.h(spannableString2);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            gVar.h((SpannableString) it.next());
                        }
                        gVar.i(charSequenceReplace);
                        eVar2.H(gVar);
                        notificationC = eVar2.c();
                    }
                    androidx.core.app.o.e(f22455d).g(numValueOf.intValue(), notificationC);
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    static boolean m(x1 x1Var) {
        K(x1Var.d());
        return M(x1Var);
    }

    static boolean n(x1 x1Var) {
        K(x1Var.d());
        E();
        D();
        return M(x1Var);
    }

    static BigInteger o(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String strK = OSUtils.k(e3.f21882e, "onesignal_notification_accent_color", null);
            if (strK != null) {
                return new BigInteger(strK, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            String strF = OSUtils.f(e3.f21882e, "com.onesignal.NotificationAccentColor.DEFAULT");
            if (strF != null) {
                return new BigInteger(strF, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private static CharSequence p() {
        ApplicationInfo applicationInfoA = i.f22060a.a(f22455d);
        return applicationInfoA == null ? "" : f22455d.getPackageManager().getApplicationLabel(applicationInfoA);
    }

    private static b q(x1 x1Var) {
        l.e eVar;
        JSONObject jSONObjectE = x1Var.e();
        b bVar = new b();
        try {
            eVar = new l.e(f22455d, k0.c(x1Var));
        } catch (Throwable unused) {
            eVar = new l.e(f22455d);
        }
        String strOptString = jSONObjectE.optString("alert", null);
        eVar.h(true).F(B(jSONObjectE)).H(new l.c().h(strOptString)).o(strOptString).I(strOptString);
        if (Build.VERSION.SDK_INT < 24 || !jSONObjectE.optString("title").equals("")) {
            eVar.p(C(jSONObjectE));
        }
        try {
            BigInteger bigIntegerO = o(jSONObjectE);
            if (bigIntegerO != null) {
                eVar.k(bigIntegerO.intValue());
            }
        } catch (Throwable unused2) {
        }
        try {
            eVar.K(jSONObjectE.has("vis") ? Integer.parseInt(jSONObjectE.optString("vis")) : 1);
        } catch (Throwable unused3) {
        }
        Bitmap bitmapX = x(jSONObjectE);
        if (bitmapX != null) {
            bVar.f22459b = true;
            eVar.x(bitmapX);
        }
        Bitmap bitmapR = r(jSONObjectE.optString("bicon", null));
        if (bitmapR != null) {
            eVar.H(new l.b().i(bitmapR).j(strOptString));
        }
        if (x1Var.j() != null) {
            try {
                eVar.L(x1Var.j().longValue() * 1000);
            } catch (Throwable unused4) {
            }
        }
        J(jSONObjectE, eVar);
        bVar.f22458a = eVar;
        return bVar;
    }

    private static Bitmap r(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        return (strTrim.startsWith("http://") || strTrim.startsWith("https://")) ? t(strTrim) : s(str);
    }

    private static Bitmap s(String str) {
        Bitmap bitmapDecodeStream;
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(f22455d.getAssets().open(str));
        } catch (Throwable unused) {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(f22455d.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
            }
            int iA = A(str);
            if (iA != 0) {
                return BitmapFactory.decodeResource(f22454c, iA);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private static Bitmap t(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            e3.b(e3.z.WARN, "Could not download image!", th);
            return null;
        }
    }

    private static Bitmap u() {
        return H(s("ic_onesignal_large_icon_default"));
    }

    private static int v() {
        int iW = w("ic_stat_onesignal_default");
        if (iW != 0) {
            return iW;
        }
        int iW2 = w("corona_statusbar_icon_default");
        if (iW2 != 0) {
            return iW2;
        }
        int iW3 = w("ic_os_notification_fallback_white_24dp");
        return iW3 != 0 ? iW3 : R.drawable.ic_popup_reminder;
    }

    private static int w(String str) {
        return f22454c.getIdentifier(str, "drawable", f22456e);
    }

    private static Bitmap x(JSONObject jSONObject) {
        Bitmap bitmapR = r(jSONObject.optString("licon"));
        if (bitmapR == null) {
            bitmapR = s("ic_onesignal_large_icon_default");
        }
        if (bitmapR == null) {
            return null;
        }
        return H(bitmapR);
    }

    private static Intent y(int i10) {
        return new Intent(f22455d, (Class<?>) f22453b).putExtra("androidNotificationId", i10).putExtra("dismissed", true);
    }

    private static PendingIntent z(int i10, Intent intent) {
        return PendingIntent.getBroadcast(f22455d, i10, intent, 201326592);
    }
}
