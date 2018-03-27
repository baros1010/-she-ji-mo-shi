package bulider;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 具体建造者
 * @author firas
 *
 */
public class HTMLBuilder extends Builder {
	private String name;
	private PrintWriter writer;

	@Override
	public void makeTitle(String title) {
		name = title + ".html";
		try {
			writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(name),"utf-8"));
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}

	@Override
	public void makeString(String str) {
		writer.println("<p>" + str + "</p>");

	}

	@Override
	public void makeItem(String[] items) {
		// TODO 自動生成されたメソッド・スタブ
		writer.println("<ul>");
		for (String item : items) {
			writer.println("<li>" + item + "</li>");

		}
		writer.println("</ul>");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		writer.println("</body></html>");
		writer.close();
	}

	public String getResult() {
		return name;
	}

}
