package n1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.blikoon.qrcodescanner.QrCodeActivity;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import r6.j;
import r6.k;
import s6.i;

/* loaded from: classes.dex */
final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final QrCodeActivity f25460a;

    /* renamed from: b, reason: collision with root package name */
    private final v6.a f25461b = new v6.a();

    /* renamed from: c, reason: collision with root package name */
    private final Map f25462c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f25463d;

    b(QrCodeActivity qrCodeActivity) {
        this.f25460a = qrCodeActivity;
        Hashtable hashtable = new Hashtable();
        this.f25462c = hashtable;
        hashtable.put(r6.e.CHARACTER_SET, "utf-8");
        hashtable.put(r6.e.TRY_HARDER, Boolean.TRUE);
        hashtable.put(r6.e.POSSIBLE_FORMATS, r6.a.QR_CODE);
    }

    private void a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f25463d;
        if (bArr2 == null) {
            this.f25463d = new byte[i10 * i11];
        } else {
            int i12 = i10 * i11;
            if (bArr2.length < i12) {
                this.f25463d = new byte[i12];
            }
        }
        Arrays.fill(this.f25463d, (byte) 0);
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = (i13 * i10) + i14;
                if (i15 >= bArr.length) {
                    break;
                }
                this.f25463d[(((i14 * i11) + i11) - i13) - 1] = bArr[i15];
            }
        }
        k kVarA = null;
        try {
            kVarA = this.f25461b.a(new r6.c(new i(new r6.i(this.f25463d, i11, i10, 0, 0, i11, i10, false))), this.f25462c);
        } catch (j unused) {
        } catch (Throwable th) {
            this.f25461b.d();
            throw th;
        }
        this.f25461b.d();
        (kVarA != null ? Message.obtain(this.f25460a.d(), l1.d.f25024d, kVarA) : Message.obtain(this.f25460a.d(), l1.d.f25023c)).sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Looper looperMyLooper;
        int i10 = message.what;
        if (i10 == l1.d.f25022b) {
            a((byte[]) message.obj, message.arg1, message.arg2);
        } else {
            if (i10 != l1.d.f25033m || (looperMyLooper = Looper.myLooper()) == null) {
                return;
            }
            looperMyLooper.quit();
        }
    }
}
