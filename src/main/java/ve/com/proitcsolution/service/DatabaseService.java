package ve.com.proitcsolution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

  private DataSource dataSource;
  @SuppressWarnings("unused")
  private AuditService auditService;

  public DatabaseService(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Autowired
  public void setAuditService(AuditService auditService) {
    this.auditService = auditService;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("DatabaseService{");
    sb.append("dataSource=").append(dataSource);
    sb.append('}');
    return sb.toString();
  }
}
