package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Attribution)
class AttributionSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

       def "test for valid attribution name"() {
	when: 'name is empty'
	def p = new Attribution(name: '')
	then: 'validation should fail'
	!p.validate()

	when: 'name is nullhere'
	def p1 = new Attribution(name: null)
	then: 'validation should fail'
	!p1.validate()
	

	when: 'name is good'
	def p2 = new Attribution(name: 'prof ki ma ki')
	then: 'validation should  not fail'
	p2.validate()
	}

}

