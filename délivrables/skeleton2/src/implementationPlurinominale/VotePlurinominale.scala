package implementationPlurinominale

import Gvote._
import implementationVoteSimple.Candidat
class VotePlurinominale(_electeur : Electeur ,_systemeElection:SystemeDecomptagePlurinomial ,list :List[Candidat ]) extends AbstractVote(_electeur ,_systemeElection) {
  val listCandidat = list 
}