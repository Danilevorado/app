package com.onesignal;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import com.onesignal.e3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class m0 {
    private static void a(JSONArray jSONArray, String str, l3 l3Var) {
        Cursor cursorA = l3Var.a("notification", new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, null, null, null);
        if (cursorA.getCount() > 1) {
            cursorA.moveToFirst();
            do {
                try {
                    jSONArray.put(new JSONObject(cursorA.getString(cursorA.getColumnIndex("full_data"))));
                } catch (JSONException unused) {
                    e3.a(e3.z.ERROR, "Could not parse JSON of sub notification in group: " + str);
                }
            } while (cursorA.moveToNext());
        }
        cursorA.close();
    }

    private static void b(Context context, l3 l3Var, String str) {
        if (str != null) {
            q0.a(context, l3Var, str);
        } else if (m3.e(context).intValue() < 1) {
            m3.i(context).cancel(m3.f());
        }
    }

    private static void c(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            androidx.core.app.o.e(context).b(intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private static boolean d(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    private static void e(Context context, Intent intent, l3 l3Var, boolean z10) {
        String str;
        String stringExtra = intent.getStringExtra("summary");
        String[] strArr = null;
        if (stringExtra != null) {
            boolean zEquals = stringExtra.equals(m3.g());
            if (zEquals) {
                str = "group_id IS NULL";
            } else {
                strArr = new String[]{stringExtra};
                str = "group_id = ?";
            }
            if (!z10 && !e3.S()) {
                String strValueOf = String.valueOf(m3.h(l3Var, stringExtra, zEquals));
                str = str + " AND android_notification_id = ?";
                strArr = zEquals ? new String[]{strValueOf} : new String[]{stringExtra, strValueOf};
            }
        } else {
            str = "android_notification_id = " + intent.getIntExtra("androidNotificationId", 0);
        }
        b(context, l3Var, stringExtra);
        l3Var.f("notification", f(intent), str, strArr);
        k.c(l3Var, context);
    }

    private static ContentValues f(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", (Integer) 1);
        } else {
            contentValues.put("opened", (Integer) 1);
        }
        return contentValues;
    }

    static void g(Context context, Intent intent) throws JSONException {
        if (d(intent)) {
            if (context != null) {
                e3.Q0(context.getApplicationContext());
            }
            c(context, intent);
            h(context, intent);
        }
    }

    static void h(Context context, Intent intent) throws JSONException {
        y1 y1VarI;
        String stringExtra;
        l3 l3VarX = l3.x(context);
        String stringExtra2 = intent.getStringExtra("summary");
        boolean booleanExtra = intent.getBooleanExtra("dismissed", false);
        if (booleanExtra) {
            y1VarI = null;
        } else {
            y1VarI = i(context, intent, l3VarX, stringExtra2);
            if (y1VarI == null) {
                return;
            }
        }
        e(context, intent, l3VarX, booleanExtra);
        if (stringExtra2 == null && (stringExtra = intent.getStringExtra("grp")) != null) {
            q0.f(context, l3VarX, stringExtra, booleanExtra);
        }
        e3.z zVar = e3.z.DEBUG;
        e3.i1(zVar, "processIntent from context: " + context + " and intent: " + intent);
        if (intent.getExtras() != null) {
            e3.i1(zVar, "processIntent intent extras: " + intent.getExtras().toString());
        }
        if (booleanExtra) {
            return;
        }
        if (context instanceof Activity) {
            e3.J0((Activity) context, y1VarI.a(), w1.b(y1VarI.b()));
            return;
        }
        e3.i1(e3.z.ERROR, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.onesignal.y1 i(android.content.Context r7, android.content.Intent r8, com.onesignal.l3 r9, java.lang.String r10) throws org.json.JSONException {
        /*
            java.lang.String r0 = "androidNotificationId"
            java.lang.String r1 = "onesignalData"
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L51
            java.lang.String r4 = r8.getStringExtra(r1)     // Catch: org.json.JSONException -> L51
            r3.<init>(r4)     // Catch: org.json.JSONException -> L51
            boolean r4 = r7 instanceof android.app.Activity     // Catch: org.json.JSONException -> L4f
            if (r4 != 0) goto L29
            com.onesignal.e3$z r4 = com.onesignal.e3.z.ERROR     // Catch: org.json.JSONException -> L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L4f
            r5.<init>()     // Catch: org.json.JSONException -> L4f
            java.lang.String r6 = "NotificationOpenedProcessor processIntent from an non Activity context: "
            r5.append(r6)     // Catch: org.json.JSONException -> L4f
            r5.append(r7)     // Catch: org.json.JSONException -> L4f
            java.lang.String r7 = r5.toString()     // Catch: org.json.JSONException -> L4f
            com.onesignal.e3.i1(r4, r7)     // Catch: org.json.JSONException -> L4f
            goto L32
        L29:
            android.app.Activity r7 = (android.app.Activity) r7     // Catch: org.json.JSONException -> L4f
            boolean r7 = com.onesignal.j1.b(r7, r3)     // Catch: org.json.JSONException -> L4f
            if (r7 == 0) goto L32
            return r2
        L32:
            r7 = 0
            int r7 = r8.getIntExtra(r0, r7)     // Catch: org.json.JSONException -> L4f
            r3.put(r0, r7)     // Catch: org.json.JSONException -> L4f
            java.lang.String r7 = r3.toString()     // Catch: org.json.JSONException -> L4f
            r8.putExtra(r1, r7)     // Catch: org.json.JSONException -> L4f
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4f
            java.lang.String r8 = r8.getStringExtra(r1)     // Catch: org.json.JSONException -> L4f
            r7.<init>(r8)     // Catch: org.json.JSONException -> L4f
            org.json.JSONArray r2 = com.onesignal.j0.g(r7)     // Catch: org.json.JSONException -> L4f
            goto L56
        L4f:
            r7 = move-exception
            goto L53
        L51:
            r7 = move-exception
            r3 = r2
        L53:
            r7.printStackTrace()
        L56:
            if (r10 == 0) goto L5b
            a(r2, r10, r9)
        L5b:
            com.onesignal.y1 r7 = new com.onesignal.y1
            r7.<init>(r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.m0.i(android.content.Context, android.content.Intent, com.onesignal.l3, java.lang.String):com.onesignal.y1");
    }
}
