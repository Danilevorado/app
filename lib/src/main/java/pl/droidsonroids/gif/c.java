package pl.droidsonroids.gif;

import com.facebook.ads.AdError;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum c {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(110, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(112, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(AdError.NETWORK_ERROR_CODE, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(AdError.NO_FILL_ERROR_CODE, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(1003, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");


    /* renamed from: m, reason: collision with root package name */
    public final String f26000m;

    /* renamed from: n, reason: collision with root package name */
    int f26001n;

    c(int i10, String str) {
        this.f26001n = i10;
        this.f26000m = str;
    }

    static c b(int i10) {
        for (c cVar : values()) {
            if (cVar.f26001n == i10) {
                return cVar;
            }
        }
        c cVar2 = UNKNOWN;
        cVar2.f26001n = i10;
        return cVar2;
    }

    String d() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(this.f26001n), this.f26000m);
    }
}
