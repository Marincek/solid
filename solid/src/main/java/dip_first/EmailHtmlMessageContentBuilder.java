package dip_first;

class EmailHtmlMessageContentBuilder implements MessageContentBuilder {

    public String getMessageContent(Employee employee, String relocation) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">")
                .append("<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\"></head>")
                .append("<body bgcolor=\"#ffffff\" text=\"#000000\">")
                .append("Hi ").append(employee.getName()).append(" you will be relocated on ").append(relocation)
                .append("<br>")
                .append("<div class=\"moz-signature\"><i><br><br>Regards<br>MusalaSoft<br></i></div>")
                .append("</body></html>");

        return stringBuilder.toString();
    }

}
