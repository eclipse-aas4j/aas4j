package org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx;

public class AASXUtils {


    /**
     * Gets the path from a URL e.g "http://localhost:8080/path/to/test.file"
     * results in "/path/to/test.file"
     *
     * @param url URL to get the path for
     * @return the path from the URL
     */
    public static String getPathFromURL(String url) {
        if (url == null) {
            return null;
        }

        if (url.contains("://")) {

            // Find the ":" and and remove the "http://" from the url
            int index = url.indexOf(":") + 3;
            url = url.substring(index);

            // Find the first "/" from the URL (now without the "http://") and remove
            // everything before that
            index = url.indexOf("/");
            url = url.substring(index);

            // Recursive call to deal with more than one server parts
            // (e.g. basyx://127.0.0.1:6998//https://localhost/test/)
            return getPathFromURL(url);
        } else {
            // Make sure the path has a / at the start
            if (!url.startsWith("/")) {
                url = "/" + url;
            }
            return url;
        }
    }
}
