package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    //void "test something"() {
        //expect:"fix me"
          //  true == false
    //}

    def "test for valid quote text"() {
		when: 'text is empty'
		def p = new Quote(text: '')
		then: 'validation should fail'
		!p.validate()

		when: 'text is  null '
		def p2 = new Quote(text: null)
		then: 'validation should fail'
		!p2.validate()

		when: 'text is  have a Text '
		def p3 = new Quote(text: 'Some nice quote')
		then: 'validation should fail'
		p3.validate()

		// TODO: add new tests for null text (should fail) and
		// legal text (should pass)
		}


    def "test for valid quote text"() {




		// TODO: add new tests for null text (should fail) and
		// legal text (should pass)
		}

}
