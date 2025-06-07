package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class vy2 {
    public static File a(File file, boolean z10) {
        if (z10 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(c(str, file), str2);
    }

    public static File c(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        a(file2, false);
        return file2;
    }

    public static boolean d(File file) {
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        boolean z10 = true;
        if (fileArrListFiles != null) {
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                File file2 = fileArrListFiles[i10];
                z10 = file2 != null && d(file2) && z10;
            }
        }
        return file.delete() && z10;
    }

    public static boolean e(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            i4.k.a(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            i4.k.a(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            i4.k.a(fileOutputStream2);
            throw th;
        }
    }
}
