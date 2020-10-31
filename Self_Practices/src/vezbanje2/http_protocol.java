package vezbanje2; // poceo dana 18.juna 2020.
/*
HTTP is the protocol that governs communications between webservers and web clients (i.e. browsers).
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
Some of the codes and their meanings arelisted below:
    status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
            NOTE: use single if statements ONLY. DO NOT use more that one print statement
 */

public class http_protocol {
    public static void main(String[] args) {

        int statusCode = 405;
        String result = "";

        if (statusCode == 200){
            result = "Ok";
        }if (statusCode == 201){
            result = " Created";
        }if (statusCode == 202){
            result = "Accepted";
        }if (statusCode == 301){
            result = "Moved Permanently";
        }if (statusCode == 303){
            result = "See Other";
        }if (statusCode == 304){
            result = "Not Modified";
        }if (statusCode == 307){
            result = "Temporary Redirect";
        }if (statusCode == 400){
            result ="Bad Request";
        }if (statusCode == 401){
            result ="Unauthorized";
        }if (statusCode == 403){
            result = "Forbidden";
        }if (statusCode == 404){
            result = "Not Found";
        }if (statusCode == 410){
            result = "Gone";
        }if (statusCode == 500){
            result = "Internal Server Error";
        }if (statusCode == 503){
            result = "Service Unavailable";
        }
        System.out.println(result);


    }
}
