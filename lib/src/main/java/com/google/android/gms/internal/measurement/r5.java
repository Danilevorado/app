package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class r5 {

    /* renamed from: f, reason: collision with root package name */
    static HashMap f19251f;

    /* renamed from: k, reason: collision with root package name */
    private static Object f19256k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f19257l;

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f19246a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f19247b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f19248c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f19249d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f19250e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    static final HashMap f19252g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    static final HashMap f19253h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    static final HashMap f19254i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    static final HashMap f19255j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    static final String[] f19258m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (r5.class) {
            if (f19251f == null) {
                f19250e.set(false);
                f19251f = new HashMap();
                f19256k = new Object();
                f19257l = false;
                contentResolver.registerContentObserver(f19246a, true, new q5(null));
            } else if (f19250e.getAndSet(false)) {
                f19251f.clear();
                f19252g.clear();
                f19253h.clear();
                f19254i.clear();
                f19255j.clear();
                f19256k = new Object();
                f19257l = false;
            }
            Object obj = f19256k;
            if (f19251f.containsKey(str)) {
                String str3 = (String) f19251f.get(str);
                if (str3 != null) {
                    str = str3;
                }
                return str;
            }
            int length = f19258m.length;
            Cursor cursorQuery = contentResolver.query(f19246a, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    c(obj, str, null);
                    return null;
                }
                String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                c(obj, str, string);
                return string != null ? string : null;
            } finally {
                cursorQuery.close();
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (r5.class) {
            if (obj == f19256k) {
                f19251f.put(str, str2);
            }
        }
    }
}
