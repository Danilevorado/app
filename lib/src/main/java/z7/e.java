package z7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public abstract class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.InputStream, java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File a(java.io.File r9, java.io.File r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.e.a(java.io.File, java.io.File):java.io.File");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:? A[Catch: Exception -> 0x00d1, SYNTHETIC, TRY_LEAVE, TryCatch #11 {Exception -> 0x00d1, blocks: (B:10:0x0044, B:12:0x0049, B:13:0x004c, B:23:0x0075, B:24:0x0078, B:25:0x007b, B:54:0x00b3, B:56:0x00b8, B:58:0x00bd, B:59:0x00c0, B:45:0x009f, B:47:0x00a4, B:49:0x00a9, B:62:0x00c4, B:64:0x00c9, B:66:0x00ce), top: B:89:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[Catch: Exception -> 0x00d1, TRY_ENTER, TryCatch #11 {Exception -> 0x00d1, blocks: (B:10:0x0044, B:12:0x0049, B:13:0x004c, B:23:0x0075, B:24:0x0078, B:25:0x007b, B:54:0x00b3, B:56:0x00b8, B:58:0x00bd, B:59:0x00c0, B:45:0x009f, B:47:0x00a4, B:49:0x00a9, B:62:0x00c4, B:64:0x00c9, B:66:0x00ce), top: B:89:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File b(java.lang.String r10, java.io.File r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.e.b(java.lang.String, java.io.File):java.io.File");
    }

    public static String c(String str) {
        return str.split("/")[r1.length - 1];
    }

    public static boolean d(File file) {
        File[] fileArrListFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static String e(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        } catch (IOException unused) {
        } catch (NoSuchAlgorithmException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : messageDigest.digest()) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            String string = sb2.toString();
            try {
                bufferedInputStream.close();
            } catch (IOException e5) {
                k9.h.n("Failed to read file " + file.getName(), e5);
            }
            return string;
        } catch (IOException unused3) {
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e10) {
                    k9.h.n("Failed to read file " + file.getName(), e10);
                }
            }
            return "";
        } catch (NoSuchAlgorithmException unused4) {
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e11) {
                    k9.h.n("Failed to read file " + file.getName(), e11);
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e12) {
                    k9.h.n("Failed to read file " + file.getName(), e12);
                }
            }
            throw th;
        }
    }

    public static String f(String str) {
        return str.substring(0, str.lastIndexOf("."));
    }

    private static boolean g(File file) throws IOException {
        try {
            try {
                new ZipFile(file).close();
            } catch (IOException unused) {
            }
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static String h(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return sb2.toString();
                }
                sb2.append(line);
                sb2.append("\n");
            } catch (Throwable th) {
                bufferedReader.close();
                fileInputStream.close();
                throw th;
            }
        }
    }
}
