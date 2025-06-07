package f4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private static void A(Parcel parcel, int i10, int i11) {
        int iW = w(parcel, i10);
        if (iW == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + iW + " (0x" + Integer.toHexString(iW) + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iW);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iW);
        return bArrCreateByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iW);
        return iArrCreateIntArray;
    }

    public static ArrayList d(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iW);
        return arrayList;
    }

    public static Parcelable e(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iW);
        return parcelable;
    }

    public static String f(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iW);
        return string;
    }

    public static String[] g(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iW);
        return strArrCreateStringArray;
    }

    public static ArrayList h(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateStringArrayList;
    }

    public static Object[] i(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return objArrCreateTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateTypedArrayList;
    }

    public static void k(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    public static int l(int i10) {
        return (char) i10;
    }

    public static boolean m(Parcel parcel, int i10) {
        A(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        if (iW == 0) {
            return null;
        }
        z(parcel, i10, iW, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double o(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        if (iW == 0) {
            return null;
        }
        z(parcel, i10, iW, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float p(Parcel parcel, int i10) {
        A(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float q(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        if (iW == 0) {
            return null;
        }
        z(parcel, i10, iW, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int r(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder s(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iW);
        return strongBinder;
    }

    public static int t(Parcel parcel, int i10) {
        A(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long u(Parcel parcel, int i10) {
        A(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long v(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        if (iW == 0) {
            return null;
        }
        z(parcel, i10, iW, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int w(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void x(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i10));
    }

    public static int y(Parcel parcel) {
        int iR = r(parcel);
        int iW = w(parcel, iR);
        int iL = l(iR);
        int iDataPosition = parcel.dataPosition();
        if (iL != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iR))), parcel);
        }
        int i10 = iW + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i10, parcel);
    }

    private static void z(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }
}
