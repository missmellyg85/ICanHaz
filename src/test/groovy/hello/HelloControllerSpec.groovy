package hello

import spock.lang.Specification

class HomeControllerSpec extends Specification {
	HomeController controller = new HomeController()

	public void testControllerIndexReturnsCorrectWords() {
		when:
			String rsp = controller.index()

		then: 
			rsp == "Blah blah"
	}
}