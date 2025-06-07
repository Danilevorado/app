package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class g6 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile z6 f18958a;

    public static z6 a(Context context) {
        z6 z6Var;
        z6 z6VarC;
        File file;
        synchronized (g6.class) {
            z6Var = f18958a;
            if (z6Var == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    if (t5.a() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                        } catch (RuntimeException e5) {
                            Log.e("HermeticFileOverrides", "no data dir", e5);
                        }
                        z6 z6VarD = file.exists() ? z6.d(file) : z6.c();
                        if (z6VarD.b()) {
                            File file2 = (File) z6VarD.a();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                try {
                                    q.g gVar = new q.g();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", "Invalid: " + line);
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            if (!gVar.containsKey(str3)) {
                                                gVar.put(str3, new q.g());
                                            }
                                            ((q.g) gVar.get(str3)).put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.i("HermeticFileOverrides", "Parsed " + file2.toString());
                                    z5 z5Var = new z5(gVar);
                                    bufferedReader.close();
                                    z6VarC = z6.d(z5Var);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        try {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        } catch (Exception unused) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e10) {
                                throw new RuntimeException(e10);
                            }
                        } else {
                            z6VarC = z6.c();
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    z6VarC = z6.c();
                }
                z6Var = z6VarC;
                f18958a = z6Var;
            }
        }
        return z6Var;
    }
}
