package v4;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
public interface a {
    Location a(GoogleApiClient googleApiClient);

    c4.c b(GoogleApiClient googleApiClient, c cVar);

    c4.c c(GoogleApiClient googleApiClient, LocationRequest locationRequest, c cVar);
}
