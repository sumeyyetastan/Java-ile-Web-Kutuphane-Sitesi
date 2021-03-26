package homework.proje;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.eq;

/**
 * Servlet implementation class Controller
 */
@WebServlet({ "/Controller", "/controller" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Books> books=new ArrayList<Books>();
	
	public void init() {
		books.add(
				new Books(1,"JANE AUSTEN HAYATIMI MAHVETTİ!",12,300,"Karton Kapak","Beth Patillo","https://i.pinimg.com/originals/40/df/e3/40dfe3e6f950502b8b75f49ad51cde7e.jpg","Jane Austen’dan intikamımı almak için İngiltere’ye gidiyorum. Ama en çok da mutlu son diye bir şey olmadığını ispatlamaya...\r\n" + 
						"Emma Grant, her şeyi daima kitabına uygun yapmıştır: saygın bir evlilik, iyi bir okuldaki saygın bir iş ve olmazsa olmaz iki de çocuk için uygun bir plan. Hayat onun için fevkalade güzeldir, ta ki kocasını başka bir kadınla\r\n" + 
						"yakalayana kadar.\r\n" + 
						"\r\n" + 
						"Emma bu olaydan sonra Austenvari romantik fikirlerinin aslında saçma hayaller olduğuna karar vermiştir. Şimdi edebi idolüyle görülecek büyük bir hesabı vardır. Böylelikle Austen’ın kayıp mektuplarının peşine düşen Emma, ilk aşkının ortaya çıkışıyla kendini yine Austenvari bir karmaşanın içinde bulur.\r\n" + 
						"\r\n" + 
						"Jane Austen Hayatımı Mahvetti, ihanete uğrayan ve sadakatin asıl anlamını çözen bir kadının hikâyesi.\r\n" + 
						""));
		books.add(
				new Books(2,"ZAMANI DURDURMANIN YOLLARI",2,298,"Karton Kapak","Matt Haig","https://i.pinimg.com/originals/59/c3/52/59c352aa685774ff2d0528f34b4dc05b.jpg","KAÇ ÖMÜR GEREK,YAŞAMAYI ÖĞRENMEK İÇİN? Tom Hazard’ın tehlikeli bir sırrı var. 41 yaşında sıradan bir tarih öğretmeni gibi görünse de nadir rastlanan bir hastalık yüzünden aslında yüzyıllardır hayatta. Shakespeare’le aynı sahnede yer almış, Kaptan Cook’la açık denizleri fethetmiş, Fitzgerald’larla içki içmiş. Ama şimdi, tek istediği normal bir hayat sürmek. Kimliğini değiştirmeye devam ettiği sürece geçmişini geride bırakabilir ve hayatta kalabilir.\r\n" + 
						"Yapmaması gereken tek bir şey var, âşık olmak.\r\n" + 
						"İngiltere’nin en önemli yazarlarından Matt Haig’in büyük övgü toplayan, 37 dile çevrilen ve yakında Benedict Cumberbatch tarafından sinemaya aktarılacak kitabı Zamanı Durdurmanın Yolları, insanın kendini kaybedip tekrar bulmasına dair güzel bir roman.\r\n" + 
						""));
		books.add(
				new Books(3,"HAYATIN KIYISINDA",4,314,"Ciltli","Jennifer Niven","https://i.pinimg.com/originals/30/1b/af/301baf59889358b182ceaab92331aef8.jpg","Ölümü büyüleyici bulan Theodore Finch sık sık kendini öldürebileceği yöntemler düşünür ancak her seferinde, küçücük bir güzellik bile ona engel olur.\r\n" + 
						"                                  \r\n" + 
						"Violet Markey ise yaşadığı kasabadan ve ablasının ölümünün yarattığı dayanılmaz acıdan kaçmak için mezuniyetine kalan günleri sayarak geleceği dört gözle beklemektedir.\r\n" + 
						" \r\n" + 
						"Finch v"
						+ "e Violet okullarındaki çan kulesinin tepesinde karşılaştıklarında kimin kimi kurtardığı belirsizdir. Bu tuhaf ikili, bir proje ödevinde eşleştiklerinde yol onları nereye götürürse; tıpkı hayat gibi büyük, küçük, tuhaf, güzel, çirkin, şaşırtıcı yerlere giderler. Kısa süre sonra, Finch yalnızca Violet’layken kendi olabildiğini; tuhaf, eğlenceli, hayatı doyasıya yaşayabilen ve ucubelikten uzak bir gence dönüştüğünü keşfeder. Violet da yalnızca Finch’leyken günlerin hesabını tutmadan yaşayabilmektedir. Ancak Violet’ın dünyası büyürken Finch’inki küçülmektedir…\r\n" + 
						""));
		books.add(
				new Books(4,"KUTUP YILDIZI",7,339,"Ciltli","Mehtap Fırat","https://i.pinimg.com/originals/fb/69/f2/fb69f212ae1322302c7d0f004d61aacf.jpg","Fedakârlık...\r\n" + 
						"Dört hecelik basit bir kelime gibi görünse de, aslında onun hayatında bir dönüm noktasıydı.\r\n" + 
						"Geçmişe dair kırgınlıklarını yetimhanede unutmaya çalışan Nisa, bir gün aynı kaderi paylaştığı arkadaşıyla farklı bir dünyanın kapısını aralar. İki dost, bu kapı aralığından uzatılan sıcacık ellere, kimsesizliğin soğuk rüzgârından korunmak ümidiyle sarılır. Nisa ve Senem sonunda o yetimhane odasının duvarlarına fısıldadıkları hayalleri gerçekleştirme şansı elde ederler.\r\n" + 
						" \r\n" + 
						"İki dost, daha önce hiç karşılaşmadıkları sıcaklığın ve zenginliğin onları değiştirmesine izin verecekler mi? Hiç tatmadıkları aşkı yeni hayatlarında bulabilecekler mi?\r\n" + 
						""));
		books.add(
				new Books(5,"HARRY POTTER",6,389,"Karton Kapak","J.K. Rowling","https://i.pinimg.com/originals/04/ff/b3/04ffb30f1231d7610027301442888e12.jpg","-“Harry, elleri titreyerek zarfı çevirince mor balmumundan bir mühür gördü; bir arma – koca bir ‘H’ harfinin çevresinde bir aslan, bir kartal, bir porsuk, bir de yılan.”\r\n" + 
						"HARRY POTTER sıradan bir çocuk olduğunu sanırken, bir baykuşun getirdiği mektupla yaşamı değişir: Başvurmadığı halde Hogwarts Cadılık ve Büyücülük Okulu’na kabul edilmiştir. Burada birbirinden ilginç dersler alır, iki arkadaşıyla birlikte maceradan maceraya koşar. Yaşayarak öğrendikleri sayesinde küçük yaşta becerikli bir büyücü olup çıkar.\r\n" + 
						"\r\n" + 
						""));
		books.add(
 				new Books(6,"PERCY JACKSON EFSANESİ",3,340,"Karton Kapak","Riordan Wiki","https://i.pinimg.com/originals/0c/d9/ef/0cd9ef114f1f1c47136cbaf81587dbc1.jpg","Bir gün birisi çıkıp size Antik Yunan tanrılarının hala hayatta olduklarını söylese ne yapardınız? Ya ailenizden birinin bu tanrılardan biri oldugunu öğrenseniz? Olağanüstü güçlere sahip olduğunuzun farkına varsanız?\r\n" + 
 						"Kim kesti Medusa’nın kafasını?\r\n" + 
 						"Kim dişi bir ayı tarafından büyütüldü?\r\n" + 
 						"Kim Pegasus’u evcilleştirdi? Ve ne oldu şu Altın Post’a?\r\n" + 
 						"Bu soruların yanıtlarını ancak bir yarı-tanrı verebilir ve\r\n" + 
 						"Percy Jackson, Perseus’un, Atalanta’nın, Bellerophon’un\r\n" + 
 						"ve diğer önemli Yunan kahramanlarının maceralarını\r\n" + 
 						"anlatmak için tekrar karşınızda!\r\n" + 
 						""));
		books.add(
				new Books(7,"ELMALI TURTA",2,423,"Ciltli","Zeynep Sahra","https://i.pinimg.com/originals/e0/2a/54/e02a5425f20bfc44092ce5950ec9e840.jpg","“Bu; kanatlarını arkasında bırakmış kelebeğin değişim hikâyesi.”\r\n" + 
						" \r\n" + 
						"Sahra’yı Ahmet’ten uzaklaştıran Yasemin, Emir ile arasına giren Cennet, Mutlu Kelebek’e yaklaşmasını engelleyen şüpheleri varken, kalbinin sesini duyması pek de kolay olmaz. Değişmeyen tek şey boynundaki ayçöreği kolyesidir ama ona dokunduğunda hala aynı şeyleri hissettiğinden ise emin değildir.\r\n" + 
						" \r\n" + 
						"Özgür kalması için kelebek kanatlarını yakmalı mı, yoksa kaçmaya devam mı etmeli? Kanatlarının kaderini seçerken hesaba katmadığı şeyler, Sahra kadar okuyucu da şaşırtacak. Romeo ve Juliet alıntıları ile süslenen bu devam kitabı sizi soluksuz bırakacak...\r\n" + 
						" \r\n" + 
						"“İnsan, yarası yarasına denk geleni severmiş...”\r\n" + 
						""));
				
		books.add(
				new Books(8,"BUGÜN ADIMI SEN KOY",6,287,"Karton Kapak","N.G. Kabal","https://i.pinimg.com/originals/76/08/b0/7608b051839321cf98b58c4217729767.jpg","-“Söylesene kimsin sen?”\r\n" + 
						"“Bugün de adımı sen koy.”\r\n" + 
						"“Rüzgar olsun.”\r\n" + 
						"“Neden Rüzgar? Bütün sıkıntılarımı üzüntülerimle birlikte alıp götürsün diye mi? Öyleyse senin de adın Deniz olsun bugün, yüksek sesle söyleyemediğin her şey bir dalganın içine karışıp kıyıya vursun artık diye.”\r\n" + 
						"-\r\n" 						" \r\n" + 
						"Zamanın hançeri boğazlarına dayanmış haldeydi.\r\n" + 
						"Köstekli saat onlar için geri sayıma çoktan başlamıştı.\r\n" + 
						"Kız hayat doluydu sayılı günlerine rağmen.\r\n" + 
						"Adam ise yaşama dair umudunu kaybetmişti uzun zaman önce.\r\n" + 
						"Zamanın içine sığamadılar.\r\n" + 
						"Adamın hatırlayamadığı geçmişi, kızın hayalini dahi kuramayacağı geleceği ile bir köprüde buluştu.\r\n" + 
						"Karşı karşıya geldiler.\r\n" + 
						"Kendi zincirlerini keşfederlerken, bir kurtuluş anahtarı arayışı içinde birbirlerinde kayboldular.\r\n" + 
						" \r\n" + 
						"ÖLÜME ÇEYREK KALA, HER GÜN YENİ BİR İSİM ALARAK AZRAİL’E KAFA TUTAN PEMBE BALYOZLU BİR KIZIN,  SONSUZLUĞU ROMANTİK, BURUK, EĞLENCELİ KEŞFİNE TANIK OLMAYA VAR MISINIZ?\r\n" + 
						""));
	}

    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bookId = request.getParameter("id");
		int id = Integer.parseInt(bookId);
		request.setAttribute("books1", books.get(id-1));
	
		RequestDispatcher rd= request.getRequestDispatcher("show_books.jsp");
		rd.forward(request, response);
	}
	public boolean userFind(String username) {
        BasicDBObject andQuery = new BasicDBObject();
        List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
        obj.add(new BasicDBObject("name", username));
        andQuery.put("$and", obj);
        MongoCursor<Document> itDoc = new AccessMongoDB().getCollection().find(andQuery).iterator();
        return itDoc.hasNext();
    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String kadi = request.getParameter("kullaniciadi");
			String sifre = request.getParameter("sifre");
			String url = null;

            if(userFind(kadi)) {
            	
                Document user = new AccessMongoDB().getCollection().find(eq("surname", sifre)).first();
                if (user.getString("surname").equals(sifre)) {
                	url="kitap-alisveris.jsp";
    				request.setAttribute("books", books);
    				RequestDispatcher rd = 
    						request.getRequestDispatcher(url);
    					rd.forward(request, response);
                } else {
                	url = "login.jsp";
                	RequestDispatcher rd = 
    						request.getRequestDispatcher(url);
    					rd.forward(request, response);
                }
            }
			
		
		
		}	
	}
