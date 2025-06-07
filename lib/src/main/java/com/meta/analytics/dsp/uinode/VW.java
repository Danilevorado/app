package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class VW implements C2K {
    public static VW A01;
    public static byte[] A02;
    public static String[] A03 = {"F9VPCRzHFTAYh6WHGcx0Jd90Enb3hSh2", "fH8nu2kqsRdgHbOq", "0ARAQCTuMPQjF7tJb0MjvB18yGPry4Qu", "N48QVONPfFEZdhqNPTKHT8FFB7x206Ht", "sPSH6DBrw2hyfCGwQm6LEVZ2ITL2jpSj", "gRA8laRbRDS4iSEHtkOaasMfi52gbS0", "x", "ATQcDE"};
    public static final String A04;
    public final LinkedHashMap<String, C0673Iu> A00 = new LinkedHashMap<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{19, 4, 31, 21, 29, 20, 14, 20, 9, 5, 3, 16, 2, 14, 26, 20, 8, 66, 99, 117, 114, 116, 105, Byte.MAX_VALUE, 99, 98, 38, 71, 98, 38, 84, 83, 85, 88, 70, 67, 88, 78, 67, 88, 76, 66, 94};
    }

    static {
        A02();
        A04 = VW.class.getSimpleName();
    }

    public static VW A00() {
        VW vw = A01;
        if (A03[3].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        A03[1] = "1qA3QfWMYYAsctqz";
        if (vw == null) {
            A01 = new VW();
        }
        VW vw2 = A01;
        String[] strArr = A03;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A03[3] = "jddXnAGVDmATkeoPPEKFEO5X5Iu6IeIG";
        return vw2;
    }

    public final AnonymousClass23 A03(String str) {
        C0673Iu adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        return null;
    }

    public final C0673Iu A04(String str) {
        return this.A00.get(str);
    }

    public final C0673Iu A05(String str, Messenger messenger, String str2) {
        C0673Iu c0673Iu = new C0673Iu(str, messenger, str2);
        this.A00.put(str, c0673Iu);
        return c0673Iu;
    }

    public final void A06() {
        Iterator<Map.Entry<String, C0673Iu>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, C0673Iu> next = it.next();
            if (A03[0].charAt(11) == 'O') {
                throw new RuntimeException();
            }
            A03[1] = "vlvRe5nph1i3Qvfj";
            AnonymousClass23 anonymousClass23 = next.getValue().A00;
            if (anonymousClass23 != null) {
                anonymousClass23.destroy();
            }
            it.remove();
        }
    }

    public final void A07(int i10, String str, Bundle bundle, Messenger messenger) throws RemoteException {
        try {
            Message messageObtain = Message.obtain((Handler) null, i10);
            if (str != null) {
                messageObtain.getData().putString(A01(30, 13, 6), str);
            }
            if (bundle != null) {
                messageObtain.getData().putBundle(A01(0, 17, 80), bundle);
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        C0673Iu c0673Iu = this.A00.get(str);
        if (c0673Iu != null && c0673Iu.A00 != null) {
            String str2 = A01(17, 13, 7) + str;
            c0673Iu.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C2K
    public final void ACJ(int i10, String str, Bundle bundle) throws RemoteException {
        C0673Iu adRecord = A04(str);
        if (adRecord != null) {
            A07(i10, str, bundle, adRecord.A01);
        }
        Iterator<Map.Entry<String, C0673Iu>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            C0673Iu value = it.next().getValue();
            try {
                value.A01.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                A08(value.A02);
            }
        }
    }
}
