package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import properties.degiskenler;
import database.database_con;
import java.util.List;
import java.sql.*;
import java.io.*;

public final class GÖMLEK_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;  charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("   <head>\r\n");
      out.write("       ");

       database_con data= new database_con();
         List<degiskenler> urunler =data.ana_sayfa_urunler_ust("SELECT * FROM `urunler` WHERE `urun_cins` LIKE 'gömlek' ");
       
       
      out.write("\r\n");
      out.write("      <!-- basic -->\r\n");
      out.write("      <meta charset=\"utf-8\">\r\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("      <!-- mobile metas -->\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("      <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\r\n");
      out.write("      <!-- site metas -->\r\n");
      out.write("      <title>Pazar Yeri</title>\r\n");
      out.write("      <meta name=\"keywords\" content=\"\">\r\n");
      out.write("      <meta name=\"description\" content=\"\">\r\n");
      out.write("      <meta name=\"author\" content=\"\">\r\n");
      out.write("      <!-- bootstrap css -->\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("      <!-- style css -->\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("      <!-- Responsive-->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("      <!-- fevicon -->\r\n");
      out.write("      <link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\r\n");
      out.write("      <!-- Scrollbar Custom CSS -->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("      <!-- Tweaks for older IEs-->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\r\n");
      out.write("      <!-- fonts -->\r\n");
      out.write("      <link href=\"https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("      <!-- font awesome -->\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("      <!--  -->\r\n");
      out.write("      <!-- owl stylesheets -->\r\n");
      out.write("      <link href=\"https://fonts.googleapis.com/css?family=Great+Vibes|Poppins:400,700&display=swap&subset=latin-ext\" rel=\"stylesheet\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("      <link rel=\"stylesoeet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("      <!-- banner bg main start -->\r\n");
      out.write("      <div class=\"banner_bg_main\">\r\n");
      out.write("         <!-- header top section start -->\r\n");
      out.write("       \r\n");
      out.write("         <!-- header top section start -->\r\n");
      out.write("         <!-- logo section start -->\r\n");
      out.write("         <div class=\"logo_section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("               <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-sm-12\">\r\n");
      out.write("                      <div class=\"logo\"><a href=\"TÜMÜ.jsp\"><h1 style=\"color:white\"><b>Pazar yeri</b></h1></a></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <!-- logo section end -->\r\n");
      out.write("         <!-- header section start -->\r\n");
      out.write("         <div class=\"header_section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("               <div class=\"containt_main\">\r\n");
      out.write("                  <div id=\"mySidenav\" class=\"sidenav\">\r\n");
      out.write("                     <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("                     <a href=\"TÜMÜ.jsp\">TÜMÜ</a>\r\n");
      out.write("                     <a href=\"ERKEK.jsp\">ERKEK</a>\r\n");
      out.write("                     <a href=\"KADIN.jsp\">KADIN</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"toggle_icon\" onclick=\"openNav()\"><img src=\"images/toggle-icon.png\"></span>\r\n");
      out.write("                  <div class=\"dropdown\">\r\n");
      out.write("                     <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">KATEGORİLER\r\n");
      out.write("                     </button>\r\n");
      out.write("                     <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("                       <a class=\"dropdown-item\" href=\"PANTOLON.jsp\">Pantolon</a>\r\n");
      out.write("                       \r\n");
      out.write("                         <a class=\"dropdown-item\" href=\"GÖMLEK.jsp\">Gömlek</a>\r\n");
      out.write("                         <a class=\"dropdown-item\" href=\"SWEATSHİRT.jsp\">Sweatshirt</a>\r\n");
      out.write("                         <a class=\"dropdown-item\" href=\"TİŞÖRT.jsp\">Tişört</a>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"main\">\r\n");
      out.write("                     <!-- Another variation with a button -->\r\n");
      out.write("                     <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Arama yapınız\">\r\n");
      out.write("                        <div class=\"input-group-append\">\r\n");
      out.write("                           <button class=\"btn btn-secondary\" type=\"button\" style=\"background-color: #f26522; border-color:#f26522 \">\r\n");
      out.write("                           <i class=\"fa fa-search\"></i>\r\n");
      out.write("                           </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"header_box\">\r\n");
      out.write("                     <div class=\"lang_box \">\r\n");
      out.write("                        <a href=\"#\" title=\"Language\" class=\"nav-link\" data-toggle=\"dropdown\" aria-expanded=\"true\">\r\n");
      out.write("                        Türkçe <i class=\"fa fa-angle-down ml-2\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                      \r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"login_menu\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                           <li><a href=\"#\">\r\n");
      out.write("                              <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>\r\n");
      out.write("                              <span class=\"padding_10\">Sepetim</span></a>\r\n");
      out.write("                           </li>\r\n");
      out.write("                           <li><a href=\"#\">\r\n");
      out.write("                              <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\r\n");
      out.write("                              <span class=\"padding_10\">Hesabım</span></a>\r\n");
      out.write("                           </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <!-- header section end -->\r\n");
      out.write("         <!-- banner section start -->\r\n");
      out.write("         <div class=\"banner_section layout_padding\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("               <div id=\"my_slider\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                  <div class=\"carousel-inner\">\r\n");
      out.write("                     <div class=\"carousel-item active\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                           <div class=\"col-sm-12\">\r\n");
      out.write("                              <h1 class=\"banner_taital\">Alışverişe başla <br>Favori kıyafetlerin burada</h1>\r\n");
      out.write("                              <div class=\"buynow_bt\"><a href=\"#\">Hemen satın al</a></div>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <!-- banner section end -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- banner bg main end -->\r\n");
      out.write("      <!-- fashion section start -->\r\n");
      out.write("      <div class=\"fashion_section\">\r\n");
      out.write("         <div id=\"main_slider\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("            <div class=\"carousel-inner\">\r\n");
      out.write("               <div class=\"carousel-item active\">\r\n");
      out.write("                  <div class=\"container\">\r\n");
      out.write("                     <h1 class=\"fashion_taital\">GÖMLEKLER</h1>\r\n");
      out.write("                     <div class=\"fashion_section_2\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            ");
for (int i = 0; i < urunler.size(); i++) { 
                            
      out.write("\r\n");
      out.write("                           <div class=\"col-lg-4 col-sm-4\">\r\n");
      out.write("                              <div class=\"box_main\">\r\n");
      out.write("                                  <h4 class=\"shirt_text\">");
      out.print(urunler.get(i).getUrun_adi());
      out.write("</h4>\r\n");
      out.write("                                 <p class=\"price_text\">Fiyat  <span style=\"color: #262626;\">");
      out.print(urunler.get(i).getUrun_fiyat());
      out.write("</span></p>\r\n");
      out.write("                                 <div class=\"tshirt_img\"><img src=\"urun_images/");
      out.print(urunler.get(i).getResim_yol());
      out.write("\"></div>\r\n");
      out.write("                                 <div class=\"btn_main\">\r\n");
      out.write("                                    <div class=\"buy_bt\"><a>");
      out.print(urunler.get(i).getUrun_size());
      out.write("</a></div>\r\n");
      out.write("                                    <div class=\"seemore_bt\"><a href=\"#\">Satın al</a></div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- fashion section end -->\r\n");
      out.write("      <!-- footer section start -->\r\n");
      out.write("\r\n");
      out.write("      <!-- footer section end -->\r\n");
      out.write("      <!-- copyright section start -->\r\n");
      out.write("      <div class=\"copyright_section\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <p class=\"copyright_text\">© 2020 All Rights Reserved. Design by <a href=\"https://html.design\">Free html  Templates</a></p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- copyright section end -->\r\n");
      out.write("      <!-- Javascript files-->\r\n");
      out.write("      <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("      <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("      <script src=\"js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("      <script src=\"js/jquery-3.0.0.min.js\"></script>\r\n");
      out.write("      <script src=\"js/plugin.js\"></script>\r\n");
      out.write("      <!-- sidebar -->\r\n");
      out.write("      <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("      <script src=\"js/custom.js\"></script>\r\n");
      out.write("      <script>\r\n");
      out.write("         function openNav() {\r\n");
      out.write("           document.getElementById(\"mySidenav\").style.width = \"250px\";\r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("         function closeNav() {\r\n");
      out.write("           document.getElementById(\"mySidenav\").style.width = \"0\";\r\n");
      out.write("         }\r\n");
      out.write("      </script>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
